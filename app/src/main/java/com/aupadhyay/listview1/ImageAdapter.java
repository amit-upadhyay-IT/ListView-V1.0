package com.aupadhyay.listview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aupadhyay on 7/17/16.
 */
public class ImageAdapter extends BaseAdapter {

    Context context;

    public ImageAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;// here I've to explicitly mention 4 because I haven't used any datastructure to store my image rather I'm simply fetching them from drawable.
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(context).inflate(R.layout.list_row, viewGroup, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        TextView pictureNameTextView = (TextView) view.findViewById(R.id.pictureNameTextView);
        imageView.setImageResource(context.getResources().getIdentifier("p"+(i+1), "drawable", context.getPackageName()));
        pictureNameTextView.setText("Picture "+(i+1));

        return view;
    }
}
