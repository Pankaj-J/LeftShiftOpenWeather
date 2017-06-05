package com.weatherappforleftshift.currentlocation.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class Temp implements Serializable {
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

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getNight() {
        return night;
    }

    public void setNight(double night) {
        this.night = night;
    }

    public double getEve() {
        return eve;
    }

    public void setEve(double eve) {
        this.eve = eve;
    }

    public double getMorn() {
        return morn;
    }

    public void setMorn(double morn) {
        this.morn = morn;
    }
}
