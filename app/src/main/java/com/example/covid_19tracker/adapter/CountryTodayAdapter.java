package com.example.covid_19tracker.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.databinding.DataBindingUtil;

import com.example.covid_19tracker.R;
import com.example.covid_19tracker.common.DataListAdapter;
import com.example.covid_19tracker.common.OnItemActionListener;
import com.example.covid_19tracker.common.OnItemClickedListener;
import com.example.covid_19tracker.common.OnItemLongClickListener;
import com.example.covid_19tracker.databinding.SingleTodayLayoutBinding;
import com.example.covid_19tracker.model.worldModel.Country;

import java.util.ArrayList;

public class CountryTodayAdapter extends DataListAdapter<Country, SingleTodayLayoutBinding, OnItemActionListener> {
    SingleTodayLayoutBinding binding;
    private static final String TAG = "CountryTodayAdapter";

    public CountryTodayAdapter(OnItemClickedListener<Country> listener, OnItemLongClickListener<Country> longListener, OnItemActionListener actionListener)  {
        super(listener, longListener, actionListener);
    }



    @Override
    protected SingleTodayLayoutBinding createBinding(LayoutInflater inflater, ViewGroup parent) {
        binding = DataBindingUtil.inflate(inflater, R.layout.single_today_layout, parent, false);
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
    protected void bind(SingleTodayLayoutBinding binding, Country country) {
        binding.setCountry(country);
        binding.getRoot().setOnClickListener(view -> {
            listener.onItemClicked(country);
        });
    }



//    private Filter filter;
//
//    //return the filter class object
//    @Override
//    public Filter getFilter() {
//        if(filter == null) {
//            filter=new SearchFilter();
//        }
//        return filter;
//    }

//    //filter class
//    private class SearchFilter extends Filter {
//
//        @Override
//        protected FilterResults performFiltering(CharSequence constraint) {
//
//            FilterResults results = new FilterResults();
//
//            //Implement filter logic
//            // if edittext is null return the actual list
//            if (constraint == null || constraint.length() == 0) {
//                //No need for filter
//                results.values = alBookInfo;
//                results.count = alBookInfo.size();
//
//            } else {
//                //Need Filter
//                // it matches the text  entered in the edittext and set the data in adapter list
//                ArrayList<String> filters = new ArrayList<String>();
//
//                for (String s : alBookInfo) {
//                    if (s.toUpperCase().trim().contains(constraint.toString().toUpperCase().trim())) {
//                        filters.add(s);
//                    }
//                }
//                results.values = filters;
//                results.count = filters.size();
//            }
//            return results;
//        }
//
//        @Override
//        protected void publishResults(CharSequence constraint,FilterResults results) {
//
//            //it set the data from filter to adapter list and refresh the recyclerview adapter
//            alBooks = (ArrayList<String>) results.values;
//            notifyDataSetChanged();
//        }
//    }
//}




}
