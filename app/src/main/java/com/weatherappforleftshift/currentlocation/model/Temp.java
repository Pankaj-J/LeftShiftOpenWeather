package com.weatherappforleftshift.currentlocation.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.weatherappforleftshift.BR;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class Temp extends BaseObservable implements Serializable {
    @SerializedName("day")
    double day;
    @SerializedName("min")
    double min;
    @SerializedName("max")
    double max;
    @SerializedName("night")
    double night;
    @SerializedName("eve")
    double eve;
    @SerializedName("morn")
    double morn;

    @Bindable
    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
        notifyPropertyChanged(BR.day);
    }

    @Bindable
    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
        notifyPropertyChanged(BR.min);
    }

    @Bindable
    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
        notifyPropertyChanged(BR.max);
    }

    @Bindable
    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
        notifyPropertyChanged(BR.night);
    }

    @Bindable
    public double getEve() {
        return eve;
    }

    public void setEve(double eve) {
        this.eve = eve;
        notifyPropertyChanged(BR.eve);
    }

    @Bindable
    public double getMorn() {
        return morn;
    }

    public void setMorn(double morn) {
        this.morn = morn;
        notifyPropertyChanged(BR.morn);
    }
}
