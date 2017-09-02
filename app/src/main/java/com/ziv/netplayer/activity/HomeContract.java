package com.ziv.netplayer.activity;

import com.ziv.netplayer.BasePresenter;
import com.ziv.netplayer.BaseView;

/**
 * Created by ziv on 2017/9/2.
 */

public interface HomeContract {
    interface View extends BaseView<Presenter> {
        void showLoading();
        void hideLoading();

        void showResult(String result);
    }

    interface Presenter extends BasePresenter {
        void getMovie();
    }
}
