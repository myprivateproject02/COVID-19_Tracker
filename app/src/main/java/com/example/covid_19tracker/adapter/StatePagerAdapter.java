package com.example.covid_19tracker.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class StatePagerAdapter extends FragmentStateAdapter {

    public StatePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            default:
                return null;
//                return new StateFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
