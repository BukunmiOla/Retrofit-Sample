package com.example.retrofit.typicode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodeComments;
import com.example.retrofit.R;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<TypicodeViewHolder> {

    List<TypicodeComments> commentsList;
    public CommentsAdapter(List<TypicodeComments> commentsList){
        this.commentsList = commentsList;
    }

    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {
        final TypicodeComments comment = commentsList.get(position);
        holder.bindComments(comment);
    }

    @Override
    public int getItemCount() {
        return commentsList != null ? commentsList.size() : 0;
    }
}
