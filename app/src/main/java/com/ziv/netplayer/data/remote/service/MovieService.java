package com.ziv.netplayer.data.remote.service;

import com.ziv.netplayer.bean.MovieEntity;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求接口
 */

public interface MovieService {
    @GET("top250")
    Call<MovieEntity> getTopMovieOnlyRetrofit(@Query("start") int start, @Query("count") int count);

    @GET("top250")
    Observable<MovieEntity> getTopMovieRxJavaRetrofit(@Query("start") int start, @Query("count") int count);
}
