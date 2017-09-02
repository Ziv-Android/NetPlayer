package com.ziv.netplayer.data;

/**
 * Created by ziv on 2017/9/2.
 */

public interface MovieDataSource {
    void getMovieList();

    void getMovieInfo();

    void saveInDb();

    void refresh();
}
