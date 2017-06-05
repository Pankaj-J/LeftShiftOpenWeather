package com.weatherappforleftshift.currentlocation;

import android.location.Location;

/**
 * Created by Pankaj on 05-06-2017.
 */

public interface CurrentLocationContractor {

    interface View {

        void setLoading(int visibility);
        void setData();

    }

    interface Presenter {


    }
}
