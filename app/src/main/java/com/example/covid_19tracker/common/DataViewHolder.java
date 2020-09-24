package com.example.covid_19tracker.common;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
    public final T binding;

    DataViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
