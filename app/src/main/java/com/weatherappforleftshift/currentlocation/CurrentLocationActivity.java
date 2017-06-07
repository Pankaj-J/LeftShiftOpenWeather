package com.weatherappforleftshift.currentlocation;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.weatherappforleftshift.R;
import com.weatherappforleftshift.adapters.CurrentLocationWeatherAdapter;
import com.weatherappforleftshift.citydata.ChooseCityWeatherActivity;
import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;
import com.weatherappforleftshift.databinding.ActivityMainBinding;


public class CurrentLocationActivity extends AppCompatActivity implements LocationListener, CurrentLocationContractor.View {

    CurrentLocationPresenter currentLocationPresenter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(CurrentLocationActivity.this, R.layout.activity_main);

        currentLocationPresenter = new CurrentLocationPresenter(this);
        currentLocationPresenter.checkGPSEnabled(getApplicationContext());
    }

    @Override
    public void onLocationChanged(Location location) {

        int lat = (int) (location.getLatitude());
        int lng = (int) (location.getLongitude());

        currentLocationPresenter.getDataForRecyclerview(getApplicationContext(), String.valueOf(lat), String.valueOf(lng), "14", "8a5f550191dc98177b1f781152ecba0b");
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }


    @Override
    public void showGPSDialog(boolean flag, LocationManager locationManager) {

        if (flag) {

            Criteria criteria = new Criteria();
            String provider = locationManager.getBestProvider(criteria, false);
            Location location = locationManager.getLastKnownLocation(provider);
            locationManager.requestLocationUpdates(provider, 400, 1, this);
            onLocationChanged(location);

        } else {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choose_city, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.choose:
                Intent aboutIntent = new Intent(CurrentLocationActivity.this, ChooseCityWeatherActivity.class);
                startActivity(aboutIntent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void initRecyclerViewWithCurrentLocationData(CurrentLocationMain currentLocationMain) {

        binding.setCity(currentLocationMain.getCity());
        binding.setLoc(currentLocationMain.getCity().getLatLong());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerview.setLayoutManager(mLayoutManager);
        CurrentLocationWeatherAdapter currentLocationWeatherAdapter = new CurrentLocationWeatherAdapter(currentLocationMain.getDayTemps());
        binding.recyclerview.setAdapter(currentLocationWeatherAdapter);
    }

    @Override
    public void showError(String msg) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
