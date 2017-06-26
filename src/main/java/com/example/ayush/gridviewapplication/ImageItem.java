package com.example.ayush.gridviewapplication;

import android.graphics.Bitmap;

/**
 * Created by admin on 6/25/2017.
 */

public class ImageItem {
    private Bitmap image;//stores image as a bitmap
    private String title;//stores title as string

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
