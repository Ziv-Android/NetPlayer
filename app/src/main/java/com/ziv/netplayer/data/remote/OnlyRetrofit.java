package com.ziv.netplayer.data.remote;

import android.util.Log;

import com.ziv.netplayer.bean.MovieEntity;
import com.ziv.netplayer.data.MovieDataSource;
import com.ziv.netplayer.data.remote.service.MovieService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ziv on 2017/9/2.
 */

public class OnlyRetrofit implements MovieDataSource {
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
                .build();

        MovieService movieService = retrofit.create(MovieService.class);
        Call<MovieEntity> call = movieService.getTopMovieOnlyRetrofit(0, 10);
        call.enqueue(new Callback<MovieEntity>() {
            @Override
            public void onResponse(Call<MovieEntity> call, Response<MovieEntity> response) {
                result = response.body().toString();
                Log.d("Ziv", "OnlyRetrofit onResponse = " + result);
            }

            @Override
            public void onFailure(Call<MovieEntity> call, Throwable t) {
                result = t.getMessage();
                Log.e("Ziv", "OnlyRetrofit onFailure = " + result);
            }
        });
        Log.d("Ziv", "OnlyRetrofit MovieInfo = " + result);
        return result;
    }

    @Override
    public void saveInDb() {

    }

    @Override
    public void refresh() {

    }
}
