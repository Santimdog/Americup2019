package com.example.americup.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.americup.R;
//********Universal Image Loader for android***************
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;
import java.util.List;

public class teamListAdapter extends ArrayAdapter<Team> {
    private Context mcontext;
    int mResource;

    public teamListAdapter(Context context, int resource, ArrayList<Team> objects) {
        super(context, resource, objects);
        mcontext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //setUpImageLoad();
        String name = getItem(position).getName();
        int points = getItem(position).getPoints();
       // String fUrl = getItem(position).getImgEquipo();

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView = inflater.inflate(mResource, parent, false);

        //ImageView imFlag = (ImageView) convertView.findViewById(R.id.imgFlag);
        TextView tvName = (TextView) convertView.findViewById(R.id.teamTextView);
        TextView tvPoints = (TextView) convertView.findViewById(R.id.pointsTextView);

        tvName.setText(name);
        tvPoints.setText(points);

        /*int defImg = mcontext.getResources().getIdentifier("@drawable/copabrasil",null,mcontext.getPackageName());
        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defImg)
                .showImageOnFail(defImg)
                .showImageOnLoading(defImg).build();
        imageLoader.displayImage(fUrl,imFlag,options);*/

        return convertView;
    }

    private void setUpImageLoad()

    {
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mcontext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }
}
