package com.example.retrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhPhotos;
import com.example.retrofit.Model.JsonPhPosts;
import com.example.retrofit.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<JsonPhPhotos> mPhotoList;
    List<JsonPhPosts> mPostList;
    private Context context;

    public CustomAdapter(Context photoContext, List<JsonPhPhotos> photoList){
        this.context = photoContext;
        this.mPhotoList = photoList;
    }

    public CustomAdapter(Context postContext, List<JsonPhPosts> postList, Integer id){
        this.context = postContext;
        this.mPostList = postList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.jh_photos_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        final JsonPhPhotos photo = mPhotoList.get(position);
        holder.bindData(context,photo);
    }

    @Override
    public int getItemCount() {
        return mPhotoList != null ? mPhotoList.size() : 0;
    }
}
