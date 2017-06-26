package com.example.ayush.gridviewapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 6/25/2017.
 */

public class CustomViewAdapter extends ArrayAdapter {

    private Context context;
    private int layoutResourceId;
    private ArrayList data = new ArrayList();

    public CustomViewAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);//inflates new layout
            holder = new ViewHolder();
            holder.image = (ImageView) row.findViewById(R.id.image1);
            holder.title = (TextView) row.findViewById(R.id.title1);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }

        ImageItem item = (ImageItem) data.get(position);//gets position of the image
        holder.title.setText(item.getTitle());//sets title
        holder.image.setImageBitmap(item.getImage());//sets image
        return row;
    }

    static class ViewHolder {
        ImageView image;//contains image
        TextView title;//contains title
    }
}
