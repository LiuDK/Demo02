package com.liudekun.player.tool;


import com.liudekun.player.bean.PassportLoginResult;
import com.liudekun.player.service.ResultService;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Tools
 * Created by Administrator on 2016/7/21.
 */
public class RetrofitRequestTool {
    public static RetrofitRequestTool instance;
    public static String BASE_URL = "http://www.playalot.cn/query/";
    private ResultService service;


    private RetrofitRequestTool() {
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofit retrofit = builder
                //基础url
                .baseUrl(BASE_URL)
                //用于Json数据的转换,需要compile 'com.squareup.retrofit2:converter-gson:2.0.0',非必须
                .addConverterFactory(GsonConverterFactory.create())
                //用于返回Rxjava调用,需要 compile 'com.squareup.retrofit2:adapter-rxjava:2.0.0',非必须
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        service = retrofit.create(ResultService.class);
    }

    public static RetrofitRequestTool getInstance() {
        if (instance == null) {
            synchronized (RetrofitRequestTool.class) {
                if (instance == null) {
                    instance = new RetrofitRequestTool();
                }
            }
        }
        return instance;
    }

    public void getLogin(Subscriber<PassportLoginResult> subscriber) {
        service.GetLogin()
                .observeOn(AndroidSchedulers.mainThread())//观察者在主线程运行（更新ui）
                .subscribeOn(Schedulers.newThread())//被观察者在新线程运行（发送请求）
                .subscribe(subscriber);
    }

}