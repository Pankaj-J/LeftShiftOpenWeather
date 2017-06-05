package com.weatherappforleftshift.currentlocation.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class CurrentLocationMain implements Serializable {

    @SerializedName("cod")
    String cod;
    @SerializedName("message")
    double message;
    @SerializedName("city")
    City city;
    @SerializedName("list")
    ArrayList<DayTemp> dayTemps;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<DayTemp> getDayTemps() {
        return dayTemps;
    }

    public void setDayTemps(ArrayList<DayTemp> dayTemps) {
        this.dayTemps = dayTemps;
    }
}
