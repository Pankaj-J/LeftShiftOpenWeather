package com.weatherappforleftshift.currentlocation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.weatherappforleftshift.R;
import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;
import com.weatherappforleftshift.rest.APIInterface;
import com.weatherappforleftshift.sa.APIClient;

import java.util.LinkedHashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APIInterface apiService = APIClient.getClient().create(APIInterface.class);
        Map<String, String> params = new LinkedHashMap<>();
        params.put("lat", "33");
        params.put("lon", "19");
        params.put("cnt", "14");
        params.put("appid", "8a5f550191dc98177b1f781152ecba0b");

        Call<CurrentLocationMain> call = apiService.getCurrentLocationData(params);

        call.enqueue(new Callback<CurrentLocationMain>() {
            @Override
            public void onResponse(Call<CurrentLocationMain> call, Response<CurrentLocationMain> response) {

                Log.v("Response",response.toString());
            }

            @Override
            public void onFailure(Call<CurrentLocationMain> call, Throwable t) {

                Log.v("Response",t.getMessage());
            }
        });
    }
}
