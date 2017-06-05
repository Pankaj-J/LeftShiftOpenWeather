package com.weatherappforleftshift.rest;

import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;


/**
 * Created by Pankaj on 31-07-2016.
 */

public interface APIInterface {


    @GET("/data/2.5/forecast/daily")
    Call<CurrentLocationMain> getCurrentLocationData(@QueryMap Map<String, String> stringStringMap);


}
