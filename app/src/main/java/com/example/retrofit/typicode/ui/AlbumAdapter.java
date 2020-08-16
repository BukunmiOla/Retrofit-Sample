package com.example.retrofit.typicode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodeAlbums;
import com.example.retrofit.R;

import java.util.List;

public class AlbumAdapter  extends RecyclerView.Adapter<TypicodeViewHolder> {

    List<TypicodeAlbums> albumsList;
    public AlbumAdapter(List<TypicodeAlbums> albumsList){
                this.albumsList = albumsList;
    }

    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {
        final TypicodeAlbums album = albumsList.get(position);
        holder.bindAlbums(album);
    }

    @Override
    public int getItemCount() {
        return albumsList != null ? albumsList.size() : 0;
    }
}
