package com.example.covid_19tracker.ui.main.Country;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.Viewmodel.MainViewmodel;
import com.example.covid_19tracker.adapter.ViewpagerAdapter;
import com.example.covid_19tracker.common.OnItemActionListener;
import com.example.covid_19tracker.databinding.ActivityHomeBinding;
import com.example.covid_19tracker.databinding.FragmentCountryBinding;

public class CountryFragment extends Fragment implements OnItemActionListener {


    private static final String TAG = "CountryFragment";
    FragmentCountryBinding binding;
    NavController navController;
    MainViewmodel viewmodel;
    ActivityHomeBinding mainBinding;
    ViewpagerAdapter viewpagerAdapter;


    public CountryFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        mainBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        View rootView = binding.getRoot();
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getActivity() != null) {

            binding.total.setBackgroundColor(Color.parseColor("#bdbdbd"));
            viewmodel = new ViewModelProvider(getActivity()).get(MainViewmodel.class);
            navController = Navigation.findNavController(view);
            binding.backBtn.setOnClickListener(view1 -> {
                navController.navigate(R.id.action_countryFragment_to_homeFragment);
            });


            viewpagerAdapter = new ViewpagerAdapter(getActivity());
            binding.viewpagerAdapter.setAdapter(viewpagerAdapter);


            binding.viewpagerAdapter.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);
                    Log.e(TAG, "onPageSelected: " + position);
                    if (position == 0) {
                        binding.viewpagerAdapter.setCurrentItem(0);
                        binding.total.setBackgroundColor(getResources().getColor(R.color.gray700));
                        binding.today.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        binding.yesterday.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    } else if (position == 1) {
                        binding.viewpagerAdapter.setCurrentItem(1);
                        binding.total.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        binding.today.setBackgroundColor(getResources().getColor(R.color.gray700));
                        binding.yesterday.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

                    } else {
                        binding.viewpagerAdapter.setCurrentItem(2);
                        binding.total.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        binding.today.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                        binding.yesterday.setBackgroundColor(getResources().getColor(R.color.gray700));
                    }


                }
            });


            binding.total.setOnClickListener(view1 -> {
                binding.viewpagerAdapter.setCurrentItem(0);
                binding.total.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.today.setBackgroundColor(getResources().getColor(R.color.gray700));
                binding.yesterday.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            });


            binding.today.setOnClickListener(view1 -> {
                binding.viewpagerAdapter.setCurrentItem(1);
                binding.total.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.today.setBackgroundColor(getResources().getColor(R.color.gray700));
                binding.yesterday.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            });

            binding.yesterday.setOnClickListener(view1 -> {
                binding.viewpagerAdapter.setCurrentItem(2);
                binding.total.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.today.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                binding.yesterday.setBackgroundColor(getResources().getColor(R.color.gray700));
            });

        }
    }


}