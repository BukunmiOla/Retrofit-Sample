package com.example.retrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhPosts;
import com.example.retrofit.R;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<JsonPhPosts> mPostList;

    public PostsAdapter(List<JsonPhPosts> postList){
        this.mPostList = postList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jh_posts_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        final JsonPhPosts post = mPostList.get(position);
        holder.bindData(post);
    }

    @Override
    public int getItemCount() {
        return mPostList != null ? mPostList.size() : 0;
    }
}
