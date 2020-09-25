package com.example.covid_19tracker.common;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class DataListAdapter<T, V extends ViewDataBinding, S extends OnItemActionListener> extends RecyclerView.Adapter<DataViewHolder<V>> {

    @NonNull
    private List<T> mItems;
    private List<T> exampleListFull;
    protected final OnItemClickedListener<T> listener;
    protected final OnItemLongClickListener<T> longListener;
    protected final S actionListener;

    public DataListAdapter(OnItemClickedListener<T> listener, OnItemLongClickListener<T> longListener, S actionListener) {
        this.listener = listener;
        this.longListener = longListener;
        this.actionListener = actionListener;
        this.mItems = new ArrayList<>();
    }


    @NonNull
    @Override
    public DataViewHolder<V> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        V binding = createBinding(inflater, parent);
        return new DataViewHolder<>(binding);
    }

    protected abstract V createBinding(LayoutInflater inflater, ViewGroup parent);

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder<V> holder, int position) {
        bind(holder.binding, mItems.get(position));

    }

    protected abstract void bind(V binding, T t);

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }

    public void setItemsList(List<T> newItems) {
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(new ItemsDiffCallback(this.mItems, newItems));
        this.mItems.clear();
        this.mItems.addAll(newItems);
        diffResult.dispatchUpdatesTo(this);
    }

    private class ItemsDiffCallback extends DiffUtil.Callback {

        private List<T> oldItems;
        private List<T> newItems;

        public ItemsDiffCallback(List<T> oldItems, List<T> newItems) {
            this.oldItems = oldItems;
            this.newItems = newItems;
        }

//        public Filter getFilter() {
//            return exampleFilter;
//        }
//
//        public Filter exampleFilter = new Filter() {
//            @Override
//            protected FilterResults performFiltering(CharSequence charSequence) {
//                List<T> filteredList = new ArrayList<>();
//                if (charSequence == null || charSequence.length() == 0) {
//                    filteredList.addAll(exampleListFull);
//                } else {
//                    String filterPattern = charSequence.toString().toLowerCase().trim();
//                    for (T t : exampleListFull) {
//                        if (t.equals(filterPattern)) {
//                            filteredList.add(t);
//                        }
//                    }
//
//                }
//                FilterResults results = new FilterResults();
//                results.values = filteredList;
//
//                return results;
//
//            }
//
//            @Override
//            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//                mItems.clear();
//                mItems.addAll((List) filterResults.values);
//            }
//        };


        @Override
        public int getOldListSize() {
            return oldItems.size();
        }

        @Override
        public int getNewListSize() {
            return newItems.size();
        }

        @Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return oldItems.get(oldItemPosition) == newItems.get(newItemPosition);
        }

        @Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return oldItems.get(oldItemPosition).equals(newItems.get(newItemPosition));
        }
    }

}
