package com.example.covid_19tracker.ui.about;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.adapter.AdvicesAdapter;
import com.example.covid_19tracker.databinding.ActivityAboutBinding;
import com.example.covid_19tracker.ui.main.HomeActivity;

public class AboutActivity extends AppCompatActivity {

    ActivityAboutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about);
        binding = ActivityAboutBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(AboutActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });


    }
}