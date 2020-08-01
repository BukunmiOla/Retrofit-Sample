package com.example.retrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.RetroPhoto;
import com.example.retrofit.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List< RetroPhoto> mPhotoList;
    private Context context;

    public CustomAdapter(Context context, List<RetroPhoto> photoList){
        this.context = context;
        this.mPhotoList = photoList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {

        final RetroPhoto photo = mPhotoList.get(position);
        holder.bindData(context,photo);
    }

    @Override
    public int getItemCount() {
        return mPhotoList != null ? mPhotoList.size() : 0;
    }
}
