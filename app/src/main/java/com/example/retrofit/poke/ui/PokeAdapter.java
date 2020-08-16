package com.example.retrofit.poke.ui;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.poke.model.PokeModel;

import java.util.List;

public class PokeAdapter extends RecyclerView.Adapter<PokeViewHolder> {
    public PokeAdapter(List<PokeModel> dataItemList) {
    }

    @NonNull
    @Override
    public PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PokeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
