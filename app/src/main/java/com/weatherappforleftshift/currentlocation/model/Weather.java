package com.weatherappforleftshift.currentlocation.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.weatherappforleftshift.BR;

import java.io.Serializable;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class Weather extends BaseObservable implements Serializable {

    @SerializedName("id")
    long id;
    @SerializedName("main")
    String main;
    @SerializedName("description")
    String desc;
    @SerializedName("icon")
    String icon;

    @Bindable
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
        notifyPropertyChanged(BR.main);
    }

    @Bindable
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        notifyPropertyChanged(BR.desc);
    }

    @Bindable
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
        notifyPropertyChanged(BR.icon);
    }
}
