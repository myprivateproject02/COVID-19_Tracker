package com.example.covid_19tracker.ui.health;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.adapter.AdvicesAdapter;
import com.example.covid_19tracker.databinding.ActivityHealthBinding;
import com.example.covid_19tracker.model.Advice;
import com.example.covid_19tracker.ui.main.HomeActivity;

import java.util.ArrayList;
import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HealthActivity extends AppCompatActivity {

    ActivityHealthBinding binding;
    AdvicesAdapter adapter;
    private List<Advice> advice = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_health);
        binding = ActivityHealthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        int[] images = {
                R.drawable.advice_01, R.drawable.advice_1,
                R.drawable.advice_2, R.drawable.advice_04,
                R.drawable.advice_05, R.drawable.advice_06,
                R.drawable.advice_07

        };

        String[] advices = {
                getString(R.string.advice_1), getString(R.string.advice_2),
                getString(R.string.advice_3), getString(R.string.advice_4),
                getString(R.string.advice_5), getString(R.string.advice_6),
                getString(R.string.advice_7)

        };

        binding.backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(HealthActivity.this, HomeActivity.class);
            startActivity(intent);
        });


        adapter = new AdvicesAdapter();
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
        for (int i = 0; i < advices.length; i++) {
            Advice a = new Advice();
            a.setImage(images[i]);
            a.setText(advices[i]);
            advice.add(a);
        }
        adapter.setAdvicesList(advice);
        adapter.notifyDataSetChanged();

    }


}