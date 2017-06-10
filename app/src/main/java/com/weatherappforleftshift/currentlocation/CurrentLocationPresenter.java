package com.weatherappforleftshift.currentlocation;

import android.content.Context;
import android.location.LocationManager;
import android.util.Log;

import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;
import com.weatherappforleftshift.rest.APIInterface;
import com.weatherappforleftshift.sa.APIClient;

import java.util.LinkedHashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.Context.LOCATION_SERVICE;

/**
 * Created by Pankaj on 05-06-2017.
 */

public class CurrentLocationPresenter implements CurrentLocationContractor.Presenter {

    CurrentLocationContractor.View view;

    public CurrentLocationPresenter(CurrentLocationContractor.View view) {
        this.view = view;
    }

    @Override
    public void checkGPSEnabled(Context context) {

        LocationManager service = (LocationManager) context.getSystemService(LOCATION_SERVICE);
        boolean enabled = service.isProviderEnabled(LocationManager.GPS_PROVIDER);
        view.showGPSDialog(enabled,service);
    }

    @Override
    public void getDataForRecyclerview(Context context, String Lat, String Lon, String count, String apiID) {

        APIInterface apiService = APIClient.getClient().create(APIInterface.class);
        Map<String, String> params = new LinkedHashMap<>();
        params.put("lat", Lat);
        params.put("lon", Lon);
        params.put("cnt", count);
        params.put("appid", apiID);

        Call<CurrentLocationMain> call = apiService.getCurrentLocationData(params);

        call.enqueue(new Callback<CurrentLocationMain>() {
            @Override
            public void onResponse(Call<CurrentLocationMain> call, Response<CurrentLocationMain> response) {

                view.initRecyclerViewWithCurrentLocationData(response.body());
            }

            @Override
            public void onFailure(Call<CurrentLocationMain> call, Throwable t) {

                view.showError(t.getMessage());
            }
        });

    }
}
