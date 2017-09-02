package com.ziv.netplayer.activity;

import com.ziv.netplayer.data.MovieRepository;

/**
 * Created by ziv on 2017/9/2.
 */

public class HomePresenter implements HomeContract.Presenter {
    private final MovieRepository mMovieRepository;
    private final HomeContract.View mHomeView;

    public HomePresenter(MovieRepository mMovieRepository, HomeContract.View mHomeView) {
        this.mMovieRepository = mMovieRepository;
        this.mHomeView = mHomeView;

        mHomeView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getMovie() {

    }
}
