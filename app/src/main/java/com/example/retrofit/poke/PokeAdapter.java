package com.example.retrofit.poke;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicodeadapter.CustomViewHolder;

import java.util.List;

public class PokeAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    public PokeAdapter(List<PokeModel> dataItemList) {
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
