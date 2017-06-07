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

public class CurrentLocationMain extends BaseObservable implements Serializable {

    @SerializedName("cod")
    String cod;
    @SerializedName("message")
    double message;
    @SerializedName("city")
    City city;
    @SerializedName("list")
    ArrayList<DayTemp> dayTemps;

    @Bindable
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
        notifyPropertyChanged(BR.cod);
    }

    @Bindable
    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    @Bindable
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
        notifyPropertyChanged(BR.city);
    }

    @Bindable
    public ArrayList<DayTemp> getDayTemps() {
        return dayTemps;
    }

    public void setDayTemps(ArrayList<DayTemp> dayTemps) {
        this.dayTemps = dayTemps;
        notifyPropertyChanged(BR.dayTemps);
    }
}
