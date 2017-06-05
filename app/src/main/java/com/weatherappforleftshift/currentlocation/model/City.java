package com.weatherappforleftshift.currentlocation.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class City implements Serializable {

    @SerializedName("geoname_id")
    long geonameID;
    @SerializedName("name")
    String name;
    @SerializedName("lat")
    double lat;
    @SerializedName("lon")
    double lon;
    @SerializedName("country")
    String country;

    public long getGeonameID() {
        return geonameID;
    }

    public void setGeonameID(long geonameID) {
        this.geonameID = geonameID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
