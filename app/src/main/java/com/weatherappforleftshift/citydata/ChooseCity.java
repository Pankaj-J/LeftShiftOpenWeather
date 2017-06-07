package com.weatherappforleftshift.citydata;

import java.io.Serializable;

/**
 * Created by Pankaj on 07-06-2017.
 */

public class ChooseCity implements Serializable {
    String name;
    long id;

    public ChooseCity(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
