package com.example.covid_19tracker.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HealthAdapter extends RecyclerView.Adapter<HealthAdapter.HealthHolder> {
    @NonNull
    @Override
    public HealthHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HealthHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HealthHolder extends RecyclerView.ViewHolder {

        public HealthHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
