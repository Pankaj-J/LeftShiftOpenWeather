package com.weatherappforleftshift.citydata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.weatherappforleftshift.R;
import com.weatherappforleftshift.adapters.CurrentLocationWeatherAdapter;
import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;

import java.util.ArrayList;


public class ChooseCityWeatherActivity extends AppCompatActivity implements ChooseCityWeatherContractor.View, AdapterView.OnItemSelectedListener {

    ChooseCityWeatherPresenter chooseCityWeatherPresenter;
    AppCompatSpinner appCompatSpinner;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city_weather);

        init();
        chooseCityWeatherPresenter.loadSpinnerData();


    }

    private void init() {

        appCompatSpinner = (AppCompatSpinner) findViewById(R.id.city_spinner);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        chooseCityWeatherPresenter = new ChooseCityWeatherPresenter(this);
    }

    @Override
    public void setSpinnerData(ArrayList<ChooseCity> spinnerData) {

        appCompatSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<ChooseCity> adapter = new ArrayAdapter<ChooseCity>(getApplicationContext(), R.layout.spinner_item, spinnerData);
        appCompatSpinner.setAdapter(adapter);

    }

    @Override
    public void setCityWeatherDetails(CurrentLocationMain dayTemp) {

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        CurrentLocationWeatherAdapter currentLocationWeatherAdapter = new CurrentLocationWeatherAdapter(dayTemp.getDayTemps());
        recyclerView.setAdapter(currentLocationWeatherAdapter);
    }

    @Override
    public void showError(String msg) {

        Toast.makeText(this, "" + msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        ChooseCity chooseCity = (ChooseCity) adapterView.getItemAtPosition(i);
        chooseCityWeatherPresenter.getDataForRecyclerview(getApplicationContext(), String.valueOf(chooseCity.getId()), "8a5f550191dc98177b1f781152ecba0b");
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
