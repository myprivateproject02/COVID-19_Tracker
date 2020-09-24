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
import com.example.covid_19tracker.adapter.CountryYesterdayAdapter;
import com.example.covid_19tracker.databinding.FragmentYesterdayBinding;
import com.example.covid_19tracker.model.worldModel.Country;

public class YesterdayCaseFragment extends Fragment {


    private static final String TAG = "YesterdayCaseFragment";
    FragmentYesterdayBinding binding;
    CountryYesterdayAdapter adapter;
    MainViewmodel viewmodel;

    public YesterdayCaseFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentYesterdayBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewmodel = new ViewModelProvider(getActivity()).get(MainViewmodel.class);

        initRecyclerTotal();
        setData();


    }


    private void initRecyclerTotal() {
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        adapter = new CountryYesterdayAdapter(this::onCountrySelect, this::longClickListener, null);
        binding.recyclerviewYesterday.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recyclerviewYesterday.setAdapter(adapter);
        binding.recyclerviewYesterday.setItemAnimator(itemAnimator);
    }

    private void setData() {
        viewmodel.getCountryYesterdayData().observe(getViewLifecycleOwner(), countrys -> {
            adapter.setItemsList(countrys);
        });
    }

    private void longClickListener(Country country) {
        Log.e(TAG, "onCountryLongSelect: " + country.getCountry().toLowerCase());
    }

    private void onCountrySelect(Country country) {
        Log.e(TAG, "onCountrySelect: " + country.getCountry().toLowerCase());
    }
}