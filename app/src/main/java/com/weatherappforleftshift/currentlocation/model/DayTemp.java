package com.weatherappforleftshift.currentlocation.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.weatherappforleftshift.BR;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class DayTemp extends BaseObservable implements Serializable {

    @SerializedName("dt")
    long date;
    @SerializedName("pressure")
    double pressure;
    @SerializedName("humidity")
    long humidity;
    @SerializedName("temp")
    Temp temp;
    @SerializedName("weather")
    ArrayList<Weather> weathers;
    @SerializedName("speed")
    double speed;
    @SerializedName("deg")
    double deg;
    @SerializedName("clouds")
    double clouds;

    @Bindable
    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
        notifyPropertyChanged(BR.date);
    }

    @Bindable
    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyPropertyChanged(BR.pressure);
    }

    @Bindable
    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
        notifyPropertyChanged(BR.humidity);
    }

    @Bindable
    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
        notifyPropertyChanged(BR.temp);
    }

    @Bindable
    public ArrayList<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(ArrayList<Weather> weathers) {
        this.weathers = weathers;
        notifyPropertyChanged(BR.weathers);
    }

    @Bindable
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        notifyPropertyChanged(BR.speed);
    }

    @Bindable
    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
        notifyPropertyChanged(BR.deg);
    }

    @Bindable
    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
        notifyPropertyChanged(BR.clouds);
    }
}
