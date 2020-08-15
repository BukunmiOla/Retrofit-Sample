package com.example.retrofit.dummy.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.typicode.ui.CustomViewHolder;

import java.util.List;

public class DummyAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<DataItem> dataItemList;

    public DummyAdapter(List<DataItem> dataItemList) {
        this.dataItemList = dataItemList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        final DataItem data = dataItemList.get(position);
        holder.bindDummyData(data);
    }

    @Override
    public int getItemCount() {

            return dataItemList != null ? dataItemList.size() : 0;
    }
}