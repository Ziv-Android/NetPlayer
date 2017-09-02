package com.ziv.netplayer.bean;

/**
 * Created by ziv on 2017/9/1.
 */

public class ImagesBean {
    /**
     * small : https://img3.doubanio.com/img/celebrity/small/230.jpg
     * large : https://img3.doubanio.com/img/celebrity/large/230.jpg
     * medium : https://img3.doubanio.com/img/celebrity/medium/230.jpg
     */

    private String small;
    private String large;
    private String medium;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
