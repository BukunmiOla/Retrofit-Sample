package com.example.retrofit.typicode.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodePhotos;
import com.example.retrofit.R;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<TypicodeViewHolder> {

    List<TypicodePhotos> mPhotoList;
    private Context context;

    public PhotosAdapter(Context photoContext, List<TypicodePhotos> photoList){
        this.context = photoContext;
        this.mPhotoList = photoList;
    }


    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.typicode_photos_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {

        final TypicodePhotos photo = mPhotoList.get(position);
        holder.bindPhotos(context,photo);
    }

    @Override
    public int getItemCount() {
        return mPhotoList != null ? mPhotoList.size() : 0;
    }
}
