package com.weatherappforleftshift.citydata;

import android.content.Context;

import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;

import java.util.ArrayList;

/**
 * Created by Pankaj on 07-06-2017.
 */

public interface ChooseCityWeatherContractor {

    interface View {

        void setSpinnerData(ArrayList<ChooseCity> spinnerData);
        void setCityWeatherDetails(CurrentLocationMain dayTemp);
        void showError(String msg);

    }

    interface Presenter {

        void loadSpinnerData();
        void getDataForRecyclerview(Context context, String cityID, String apiID);

    }
}
