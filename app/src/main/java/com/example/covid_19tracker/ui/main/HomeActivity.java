package com.example.covid_19tracker.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.os.Handler;

import com.example.covid_19tracker.Viewmodel.MainViewmodel;
import com.example.covid_19tracker.databinding.ActivityHomeBinding;


import java.util.Timer;
import java.util.TimerTask;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    private static final String TAG = "MainActivity";
    MainViewmodel viewmodel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewmodel = new ViewModelProvider(this).get(MainViewmodel.class);

        timer();
        timer2();

    }

    private void timer2() {
        Handler handler = new Handler();
        handler.post(() -> {
            viewmodel.getAllCases();
            handler.postDelayed(this::timer, 1000);
        });
    }


    private void timer() {
        Handler handler = new Handler();
        handler.post(() -> {
            viewmodel.fetchData();
            handler.postDelayed(this::timer, 60000);
        });
    }


}