package com.example.covid_19tracker.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.common.DataListAdapter;
import com.example.covid_19tracker.common.OnItemActionListener;
import com.example.covid_19tracker.common.OnItemClickedListener;
import com.example.covid_19tracker.common.OnItemLongClickListener;
import com.example.covid_19tracker.databinding.SingleStateLayoutBinding;
import com.example.covid_19tracker.model.indianModel.Statewise;

public class StateAdapter extends DataListAdapter<Statewise, SingleStateLayoutBinding, OnItemActionListener>  {

    SingleStateLayoutBinding binding;
    private static final String TAG = "StateAdapter";

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


    public StateAdapter(OnItemClickedListener<Statewise> listener, OnItemLongClickListener<Statewise> longListener, OnItemActionListener actionListener) {
        super(listener, longListener, actionListener);
    }

    @Override
    protected SingleStateLayoutBinding createBinding(LayoutInflater inflater, ViewGroup parent) {
        binding = DataBindingUtil.inflate(inflater, R.layout.single_state_layout, parent, false);
        binding.getRoot().setOnClickListener(view -> {
            Log.e(TAG, "createBinding:  click");
        });

        binding.getRoot().setOnLongClickListener(view -> {
            Log.e(TAG, "createBinding: long click");
            return false;
        });
        return binding;
    }

    @Override
    protected void bind(SingleStateLayoutBinding binding, Statewise statewise) {
        binding.setState(statewise);
        binding.getRoot().setOnClickListener(view -> {
            listener.onItemClicked(statewise);
        });
    }
}
