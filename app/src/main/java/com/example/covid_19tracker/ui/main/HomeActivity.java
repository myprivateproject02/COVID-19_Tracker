package com.example.covid_19tracker.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.covid_19tracker.Viewmodel.MainViewmodel;
import com.example.covid_19tracker.databinding.ActivityHomeBinding;


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
        BackgroundThread backgroundThread = new BackgroundThread();
        backgroundThread.start();

    }

    public class BackgroundThread extends Thread {
        @Override
        public void run() {
            viewmodel.fetchData();
        }
    }

}