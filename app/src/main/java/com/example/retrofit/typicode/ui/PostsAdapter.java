package com.example.retrofit.typicode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodePosts;
import com.example.retrofit.R;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<TypicodeViewHolder> {
    List<TypicodePosts> mPostList;

    public PostsAdapter(List<TypicodePosts> postList){
        this.mPostList = postList;
    }


    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {

        final TypicodePosts post = mPostList.get(position);
        holder.bindPosts(post);
    }

    @Override
    public int getItemCount() {
        return mPostList != null ? mPostList.size() : 0;
    }
}
