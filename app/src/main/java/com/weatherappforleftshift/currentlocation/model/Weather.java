package com.weatherappforleftshift.currentlocation.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class Weather implements Serializable {

    @SerializedName("id")
    long id;
    @SerializedName("main")
    String main;
    @SerializedName("description")
    String desc;
    @SerializedName("icon")
    String icon;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
