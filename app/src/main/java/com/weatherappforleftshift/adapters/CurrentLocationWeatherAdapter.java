package com.weatherappforleftshift.adapters;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.weatherappforleftshift.BR;
import com.weatherappforleftshift.R;
import com.weatherappforleftshift.currentlocation.model.DayTemp;

import java.util.ArrayList;

/**
 * Created by Pankaj on 06-06-2017.
 */

public class CurrentLocationWeatherAdapter extends RecyclerView.Adapter<CurrentLocationWeatherAdapter.ViewHolder> {

    private ArrayList<DayTemp> weatherData;

    public CurrentLocationWeatherAdapter(ArrayList<DayTemp> weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.weather_item_layout, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final DayTemp temperatureData = weatherData.get(position);
        holder.bind(temperatureData);
    }

    @Override
    public int getItemCount() {
        return weatherData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        private final ViewDataBinding binding;

        public ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.daytemp, obj);
            binding.executePendingBindings();

        }


    }
}
