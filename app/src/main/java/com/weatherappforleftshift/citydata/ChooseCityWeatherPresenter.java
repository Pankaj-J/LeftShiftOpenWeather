package com.weatherappforleftshift.citydata;

import android.content.Context;

import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;
import com.weatherappforleftshift.rest.APIInterface;
import com.weatherappforleftshift.sa.APIClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Pankaj on 07-06-2017.
 */

public class ChooseCityWeatherPresenter implements ChooseCityWeatherContractor.Presenter {

    ChooseCityWeatherContractor.View view;

    public ChooseCityWeatherPresenter(ChooseCityWeatherContractor.View view) {
        this.view = view;
    }

    @Override
    public void loadSpinnerData() {

        ArrayList<ChooseCity> cities = new ArrayList<>();
        cities.add(new ChooseCity("Razvilka", 819827));
        cities.add(new ChooseCity("Moscow", 524901));
        cities.add(new ChooseCity("Firozpur", 1271881));
        cities.add(new ChooseCity("Pokhara", 1282898));
        cities.add(new ChooseCity("Kurovskoye", 538601));
        cities.add(new ChooseCity("Donetsk", 709717));

        view.setSpinnerData(cities);

    }

    @Override
    public void getDataForRecyclerview(Context context, String cityID, String apiID) {

        APIInterface apiService = APIClient.getClient().create(APIInterface.class);
        Map<String, String> params = new LinkedHashMap<>();
        params.put("id", cityID);
        params.put("cnt", "14");
        params.put("appid", apiID);

        Call<CurrentLocationMain> call = apiService.getCurrentLocationData(params);

        call.enqueue(new Callback<CurrentLocationMain>() {
            @Override
            public void onResponse(Call<CurrentLocationMain> call, Response<CurrentLocationMain> response) {

                view.setCityWeatherDetails(response.body());
            }

            @Override
            public void onFailure(Call<CurrentLocationMain> call, Throwable t) {

                view.showError(t.getMessage());
            }
        });

    }
}
