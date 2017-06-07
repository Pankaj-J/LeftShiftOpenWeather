package com.weatherappforleftshift.currentlocation;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

import com.weatherappforleftshift.currentlocation.model.CurrentLocationMain;

/**
 * Created by Pankaj on 05-06-2017.
 */

public interface CurrentLocationContractor {

    interface View {

        void showGPSDialog(boolean flag,LocationManager locationManager);
        void initRecyclerViewWithCurrentLocationData(CurrentLocationMain currentLocationMain);
        void showError(String msg);

    }

    interface Presenter {

        void checkGPSEnabled(Context context);
        void getDataForRecyclerview(Context context,String Lat,String Lon,String count,String apiID);

    }
}
