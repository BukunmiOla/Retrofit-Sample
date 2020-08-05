package com.example.retrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.model.TypicodeComments;
import com.example.retrofit.R;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<TypicodeComments> commentsList;
    public CommentsAdapter(List<TypicodeComments> commentsList){
        this.commentsList = commentsList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.typicode_other_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        final TypicodeComments comment = commentsList.get(position);
        holder.bindCommentData(comment);
    }

    @Override
    public int getItemCount() {
        return commentsList != null ? commentsList.size() : 0;
    }
}
