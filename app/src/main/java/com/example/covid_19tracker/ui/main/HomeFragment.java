package com.example.covid_19tracker.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.Viewmodel.MainViewmodel;
import com.example.covid_19tracker.databinding.FragmentHomeBinding;
import com.example.covid_19tracker.model.Advice;
import com.example.covid_19tracker.ui.health.HealthActivity;
import com.example.covid_19tracker.ui.states.StatesActivity;

import java.text.NumberFormat;
import java.util.Locale;

public class HomeFragment extends Fragment {

    MainViewmodel viewmodel;
    private static final String TAG = "HomeFragment";
    FragmentHomeBinding binding;
    NavController navController;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (getActivity() != null) {
            viewmodel = new ViewModelProvider(getActivity()).get(MainViewmodel.class);
            navController = Navigation.findNavController(view);


            binding.states.setOnClickListener(view1 -> {
                Log.e(TAG, "onViewCreated: long click.");
                Intent stateActivity = new Intent(getActivity(), StatesActivity.class);
                startActivity(stateActivity);

            });

            binding.health.setOnClickListener(view1 -> {
                Intent intent = new Intent(getActivity(), HealthActivity.class);
                startActivity(intent);
            });

            binding.country.setOnClickListener(view2 -> {
                navController.navigate(R.id.action_homeFragment_to_countryFragment);
            });

            binding.daily.setOnClickListener(view2 -> {
                Log.e(TAG, "onCreate: daily clicked...");
            });


//            Set Overall Details in main page......
            viewmodel.getAllCases().observe(getViewLifecycleOwner(), world -> {
                binding.totalCasses.setText("" + NumberFormat.getNumberInstance(Locale.US).format(world.getCases()));
                binding.totalDeath.setText("" + NumberFormat.getNumberInstance(Locale.US).format(world.getDeaths()));
                binding.totalRecovered.setText("" + NumberFormat.getNumberInstance(Locale.US).format(world.getRecovered()));

            });

        }


    }


}