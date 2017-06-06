package com.weatherappforleftshift.currentlocation.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.weatherappforleftshift.BR;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class City extends BaseObservable implements Serializable {

    @SerializedName("geoname_id")
    long geonameID;
    @SerializedName("name")
    String name;
    @SerializedName("coord")
    LatLong latLong;
    @SerializedName("country")
    String country;

    @Bindable
    public long getGeonameID() {
        return geonameID;
    }

    public void setGeonameID(long geonameID) {
        this.geonameID = geonameID;
        notifyPropertyChanged(BR.geonameID);

    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    public LatLong getLatLong() {
        return latLong;
    }

    public void setLatLong(LatLong latLong) {
        this.latLong = latLong;
    }

    @Bindable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
        notifyPropertyChanged(BR.country);

    }
}
