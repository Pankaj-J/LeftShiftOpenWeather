package com.weatherappforleftshift.currentlocation.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.weatherappforleftshift.BR;

import java.io.Serializable;

/**
 * Created by Pankaj on 06-06-2017.
 */

public class LatLong extends BaseObservable implements Serializable {
    @SerializedName("lat")
    double lat;
    @SerializedName("lon")
    double lon;

    @Bindable
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
        notifyPropertyChanged(BR.lat);
    }

    @Bindable
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
        notifyPropertyChanged(BR.lon);
    }
}
