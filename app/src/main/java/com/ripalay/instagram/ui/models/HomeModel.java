package com.ripalay.instagram.ui.models;

import android.widget.ImageView;

public class HomeModel {
    private int imageView;
    private String data;
    private String describ;

    public HomeModel(int imageView, String data, String describ) {
        this.imageView = imageView;
        this.data = data;
        this.describ = describ;
    }

    public int getImageView() {
        return imageView;
    }

    public String getData() {
        return data;
    }

    public String getDescrib() {
        return describ;
    }
}
