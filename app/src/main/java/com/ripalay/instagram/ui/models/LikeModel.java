package com.ripalay.instagram.ui.models;

public class LikeModel {
    private int avatar;
    private String name;
    private String time;
    private int rec;

    public LikeModel(int avatar, String name, String time, int rec) {
        this.avatar = avatar;
        this.name = name;
        this.time = time;
        this.rec = rec;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public int getRec() {
        return rec;
    }
}
