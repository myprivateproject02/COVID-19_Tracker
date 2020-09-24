package com.example.covid_19tracker.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.common.DataListAdapter;
import com.example.covid_19tracker.common.OnItemActionListener;
import com.example.covid_19tracker.common.OnItemClickedListener;
import com.example.covid_19tracker.common.OnItemLongClickListener;
import com.example.covid_19tracker.databinding.SingleTodayLayoutBinding;
import com.example.covid_19tracker.model.worldModel.Country;

public class CountryTodayAdapter extends DataListAdapter<Country, SingleTodayLayoutBinding, OnItemActionListener> {
    SingleTodayLayoutBinding binding;
    private static final String TAG = "CountryTodayAdapter";

    public CountryTodayAdapter(OnItemClickedListener<Country> listener, OnItemLongClickListener<Country> longListener, OnItemActionListener actionListener) {
        super(listener, longListener, actionListener);
    }

    @Override
    protected SingleTodayLayoutBinding createBinding(LayoutInflater inflater, ViewGroup parent) {
        binding = DataBindingUtil.inflate(inflater, R.layout.single_today_layout, parent, false);
        binding.getRoot().setOnClickListener(view -> {
            Log.e(TAG, "createBinding:  click");
        });


        binding.getRoot().setOnLongClickListener(view -> {
            Log.e(TAG, "createBinding: long click");
            return false;
        });
        return binding;
    }

    @Override
    protected void bind(SingleTodayLayoutBinding binding, Country country) {
        binding.setCountry(country);
        binding.getRoot().setOnClickListener(view -> {
            listener.onItemClicked(country);
        });
    }
}
