package com.example.covid_19tracker.ui.states;

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

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.Viewmodel.StateViewmodel;
import com.example.covid_19tracker.adapter.CountryTotalAdapter;
import com.example.covid_19tracker.adapter.StateAdapter;
import com.example.covid_19tracker.databinding.FragmentStateBinding;
import com.example.covid_19tracker.model.indianModel.IndinaModel;
import com.example.covid_19tracker.model.indianModel.Statewise;
import com.example.covid_19tracker.model.worldModel.Country;


public class StateFragment extends Fragment {


    private static final String TAG = "StateFragment";
    FragmentStateBinding binding;
    StateAdapter adapter;
    StateViewmodel viewmodel;

    public StateFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStateBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewmodel = new ViewModelProvider(getActivity()).get(StateViewmodel.class);

        initRecycler();
        setData();


    }

    private void initRecycler() {
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();
        adapter = new StateAdapter(this::onCountrySelect, this::longClickListener, null);
        binding.recyclerviewState.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        binding.recyclerviewState.setAdapter(adapter);
        binding.recyclerviewState.setItemAnimator(itemAnimator);
    }

    private void setData() {
        viewmodel.getIndianData().observe(getViewLifecycleOwner(), indinaModel -> {
            adapter.setItemsList(indinaModel.getStatewise());
        });
    }

    private void longClickListener(Statewise statewise) {
        Log.e(TAG, "onCountryLongSelect: " + statewise.getState());
    }

    private void onCountrySelect(Statewise statewise) {
        Log.e(TAG, "onCountrySelect: " + statewise.getState());
    }
}