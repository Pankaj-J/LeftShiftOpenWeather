package com.weatherappforleftshift.currentlocation;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Pankaj on 07-06-2017.
 */


public class BindingAdapterUtils {

    @BindingAdapter({"android:src"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext()).load("http://openweathermap.org/img/w/"+url+".png").into(view);
    }
}
