package com.hly.emptyactivity;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class FilmGlideUtils {
    public FilmGlideUtils() {
    }
    public static void load(Context context, ImageView imageView, String url, int placeHolder) {

        RequestOptions options = new RequestOptions()
                .placeholder(placeHolder)
                .error(placeHolder)
                .transform(new CenterCrop(), new RoundedCorners(30));

        Glide.with(context.getApplicationContext()).load(url).apply(options).into(imageView);

    }

    public static void loadCenterCrop(Context context, ImageView imageView, String url, int placeHolder) {
        RequestOptions options = (new RequestOptions()).placeholder(placeHolder).error(placeHolder).centerCrop();
        Glide.with(context.getApplicationContext()).load(url).apply(options).into(imageView);
    }
}
