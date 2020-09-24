package com.example.covid_19tracker.ui.main.Country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.covid_19tracker.Viewmodel.MainViewmodel;
import com.example.covid_19tracker.adapter.CountryTotalAdapter;
import com.example.covid_19tracker.databinding.FragmentTotalCasesBinding;
import com.example.covid_19tracker.model.worldModel.Country;


public class TotalCasesFragment extends Fragment {


    private static final String TAG = "TotalCasesFragment";
    FragmentTotalCasesBinding binding;
    CountryTotalAdapter adapter;
    MainViewmodel viewmodel;

    public TotalCasesFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTotalCasesBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getActivity() != null) {
            viewmodel = new ViewModelProvider(getActivity()).get(MainViewmodel.class);

            initRecyclerTotal();
            setData();

        }
    }


    private void initRecyclerTotal() {
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        adapter = new CountryTotalAdapter(this::onCountrySelect, this::longClickListener, null);
        binding.recyclerviewTotal.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recyclerviewTotal.setAdapter(adapter);
        binding.recyclerviewTotal.setItemAnimator(itemAnimator);
    }

    private void setData() {
        viewmodel.getCountrys().observe(getViewLifecycleOwner(), myArrays -> {
            adapter.setItemsList(myArrays);
        });
    }

    private void longClickListener(Country myArray) {
        Log.e(TAG, "onCountryLongSelect: " + myArray.getCountry().toLowerCase());
    }

    private void onCountrySelect(Country myArray) {
        Log.e(TAG, "onCountrySelect: " + myArray.getCountry().toLowerCase());
    }


}