package com.weatherappforleftshift.currentlocation.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class DayTemp implements Serializable {

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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public ArrayList<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(ArrayList<Weather> weathers) {
        this.weathers = weathers;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getClouds() {
        return clouds;
    }

    public void setClouds(double clouds) {
        this.clouds = clouds;
    }
}
