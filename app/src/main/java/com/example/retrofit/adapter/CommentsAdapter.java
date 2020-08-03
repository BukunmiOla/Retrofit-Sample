package com.example.retrofit.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhComments;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<JsonPhComments> commentsList;
    public CommentsAdapter(List<JsonPhComments> commentsList){
        this.commentsList = commentsList;
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
