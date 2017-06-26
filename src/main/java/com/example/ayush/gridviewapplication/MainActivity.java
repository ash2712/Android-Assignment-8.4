package com.example.ayush.gridviewapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private ImageView imageView;
    private ArrayList<ImageItem> getData;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gw1);


        CustomViewAdapter c1 = new CustomViewAdapter(this, R.layout.image, getData());
        gridView.setAdapter(c1);//sets adapter to gridview
    }

    private ArrayList getData() {
        Bitmap bt1 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_gingerbread_image);
        Bitmap bt2 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_honeycomb_image);
        Bitmap bt3 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_ice_cream_sandwich);
        Bitmap bt4 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_jelly_bean);
        Bitmap bt5 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_kitkat);
        Bitmap bt6 = BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.android_lollipop);//saves drawable images as bitmap

        ArrayList<Bitmap> myPictures = new ArrayList<Bitmap>();
            myPictures.add(bt1);
            myPictures.add(bt2);
            myPictures.add(bt3);
            myPictures.add(bt4);
            myPictures.add(bt5);
            myPictures.add(bt6);//adds all bitmaps in an array

        ArrayList<String> titles = new ArrayList<>();
            titles.add(0,"Gingerbread");
            titles.add(1,"Honeycomb");
            titles.add(2,"Ice Cream Sandwich");
            titles.add(3,"Jelly Bean");
            titles.add(4,"Kitkat");
            titles.add(5,"Lollipop");//adds names of android titles in an array

        getData = new ArrayList<ImageItem>();
        for(int i = 0; i < 6; i++){
            ImageItem imageItem = new ImageItem();
            imageItem.setImage(myPictures.get(i));
            imageItem.setTitle(titles.get(i));
            getData.add(imageItem);//adds items in array to getData
        }
        return getData;
    }
}
