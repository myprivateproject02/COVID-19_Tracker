package com.example.covid_19tracker.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.covid_19tracker.ui.main.Country.TodayCaseFrahment;
import com.example.covid_19tracker.ui.main.Country.TotalCasesFragment;
import com.example.covid_19tracker.ui.main.Country.YesterdayCaseFragment;

public class ViewpagerAdapter extends FragmentStateAdapter {


    public ViewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TotalCasesFragment();
            case 1:
                return new TodayCaseFrahment();
            default:
                return new YesterdayCaseFragment();

        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
