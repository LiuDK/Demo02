package com.liudekun.player;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.liudekun.player.bean.PassportLoginResult;
import com.liudekun.player.tool.Item;
import com.liudekun.player.tool.RetrofitRequestTool;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity {
    List<PassportLoginResult.PostsBean> posts;
    private List<String> data = new ArrayList<>();
    private RecyclerView mRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化
        Fresco.initialize(this);

        setContentView(R.layout.activity_main);
        posts = loadLatestNews();
        initView();

    }

    private void initView() {
        mRecycler = (RecyclerView) findViewById(R.id.recycler);
        mRecycler.setItemAnimator(new DefaultItemAnimator());
//        recycler.addItemDecoration();//设置分割线
        mRecycler.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecycler.addItemDecoration(new Item(16));


    }

    private List<PassportLoginResult.PostsBean> loadLatestNews() {
        RetrofitRequestTool.getInstance().getLogin(new Subscriber<PassportLoginResult>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(PassportLoginResult string) {
                if (string != null) {
                    posts = string.getPosts();
                    mRecycler.setAdapter(new MyAdapter(posts));
//                    String url = posts.get(0).getPhotos().get(0).getUrl();
//                    Log.e("url",url);
//                    List<PassportLoginResult.PostsBean.PhotosBean> photos = posts.get(0).getPhotos();
                }
            }
        });
        return posts;
    }

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        List<PassportLoginResult.PostsBean> post;
//        private List<PassportLoginResult.PostsBean.PhotosBean> mPhotos;

        private MyAdapter(List<PassportLoginResult.PostsBean> list) {
            post = list;
        }

        @Override

        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout, parent, false);
            MyViewHolder viewHolder = new MyViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            for (PassportLoginResult.PostsBean photos:posts) {
                List<PassportLoginResult.PostsBean.PhotosBean> photos1 = photos.getPhotos();
                for (PassportLoginResult.PostsBean.PhotosBean url:photos1) {
                    String url1 = url.getUrl();
                    holder.simple.setImageURI(Uri.parse(url1));
                }
            }
        }

        @Override
        public int getItemCount() {
            return posts.size();
//            return data.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public SimpleDraweeView simple;

            public MyViewHolder(View itemView) {
                super(itemView);
                simple = (SimpleDraweeView) itemView.findViewById(R.id.simple);
            }
        }
    }


}
