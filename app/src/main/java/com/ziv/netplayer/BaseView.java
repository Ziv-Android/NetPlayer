package com.ziv.netplayer;

/**
 * Created by ziv on 2017/8/19.
 */

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
