package com.example.retrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhPhotos;
import com.example.retrofit.R;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<JsonPhPhotos> mPhotoList;
    private Context context;

    public PhotosAdapter(Context photoContext, List<JsonPhPhotos> photoList){
        this.context = photoContext;
        this.mPhotoList = photoList;
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
