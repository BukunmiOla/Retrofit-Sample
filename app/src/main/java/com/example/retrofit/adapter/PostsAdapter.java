package com.example.retrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.model.TypicodePosts;
import com.example.retrofit.R;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<TypicodePosts> mPostList;

    public PostsAdapter(List<TypicodePosts> postList){
        this.mPostList = postList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.typicode_other_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        final TypicodePosts post = mPostList.get(position);
        holder.bindPostsData(post);
    }

    @Override
    public int getItemCount() {
        return mPostList != null ? mPostList.size() : 0;
    }
}
