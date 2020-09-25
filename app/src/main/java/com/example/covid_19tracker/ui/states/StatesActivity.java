package com.example.covid_19tracker.ui.states;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.covid_19tracker.Viewmodel.StateViewmodel;


import com.example.covid_19tracker.databinding.ActivityStatesBinding;
import com.example.covid_19tracker.model.indianModel.Statewise;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class StatesActivity extends AppCompatActivity {

    ActivityStatesBinding binding;
    StateViewmodel viewmodel;
    private static final String TAG = "StatesActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_states);
        binding = ActivityStatesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewmodel = new ViewModelProvider(this).get(StateViewmodel.class);
        timer();

    }

    private void timer() {
        Handler handler = new Handler();
        handler.post(() -> {
            viewmodel.fetchData();
            handler.postDelayed(this::timer, 60000);
        });
    }
}