package com.example.retrofit.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.RetroPhoto;
import com.example.retrofit.R;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv;
    private ImageView photoIv;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        titleTv = itemView.findViewById(R.id.title_tv);
        photoIv = itemView.findViewById(R.id.photo_image_view);

    }

    public void bindData(Context context, RetroPhoto photo) {
        titleTv.setText(photo.getTitle());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(photo.getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(photoIv);

    }

}
