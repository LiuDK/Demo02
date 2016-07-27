package com.liudekun.player.service;

import com.liudekun.player.bean.PassportLoginResult;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2016/7/21.
 */
    public interface ResultService {
        @GET("home")
        Observable<PassportLoginResult> GetLogin();
    }
