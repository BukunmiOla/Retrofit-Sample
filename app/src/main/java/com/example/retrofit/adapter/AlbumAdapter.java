package com.example.retrofit.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhAlbums;

import java.util.List;

public class AlbumAdapter  extends RecyclerView.Adapter<CustomViewHolder> {

    List<JsonPhAlbums> albumsList;
    public AlbumAdapter(List<JsonPhAlbums> albumsList){
                this.albumsList = albumsList;
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
