package com.ziv.netplayer.data.remote;

import com.ziv.netplayer.data.MovieDataSource;
import com.ziv.netplayer.data.remote.service.MovieService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ziv on 2017/9/2.
 */

public class RxJavaRetrofit implements MovieDataSource {
    private String result;

    @Override
    public void getMovieList() {

    }

    @Override
    public String getMovieInfo() {
        String baseUrl = "https://api.douban.com/v2/movie/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        MovieService movieService = retrofit.create(MovieService.class);
        movieService.getTopMovieRxJavaRetrofit(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
//                        new Subscriber<MovieEntity>(){
//                    @Override
//                    public void onSubscribe(Subscription s) {
//
//                    }
//
//                    @Override
//                    public void onNext(MovieEntity movieEntity) {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                }
                );


        return result;
    }

    @Override
    public void saveInDb() {

    }

    @Override
    public void refresh() {

    }
}