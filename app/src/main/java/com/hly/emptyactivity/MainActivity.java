package com.hly.emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    private LinearLayout cons;
    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cons = findViewById(R.id.cons);


        imageView = findViewById(R.id.img);
        imageView1 = findViewById(R.id.img1);
        imageView2 = findViewById(R.id.img2);

        FilmGlideUtils.load(this, imageView, "https://raw.githubusercontent.com/leon5458/my_use_image/master/my_use_image/1.jpg", R.mipmap.img5);


        RequestOptions roundOptions = new RequestOptions()
                .transform(new RoundedCorners(30));


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cons.removeAllViews();

            }
        });
    }
}
