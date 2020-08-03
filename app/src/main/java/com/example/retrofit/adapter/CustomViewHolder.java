package com.example.retrofit.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhAlbums;
import com.example.retrofit.Model.JsonPhComments;
import com.example.retrofit.Model.JsonPhPhotos;
import com.example.retrofit.Model.JsonPhPosts;
import com.example.retrofit.Model.JsonPhTodo;
import com.example.retrofit.Model.users.JsonPhUsers;
import com.example.retrofit.R;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv, bodyTv;
    private ImageView photoIv;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

    }

    public void bindData(Context context, JsonPhPhotos photo) {
        titleTv = itemView.findViewById(R.id.title_tv);
        photoIv = itemView.findViewById(R.id.photo_image_view);


        titleTv.setText(photo.getTitle());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(photo.getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(photoIv);

    }

    public void bindData(JsonPhPosts post) {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);

        titleTv.setText(post.getTitle());
        bodyTv.setText(post.getBody());

    }
    public void bindData(JsonPhComments comment) {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);

//        titleTv.setText(comment.getTitle());
        bodyTv.setText(comment.getBody());

    }
    public void bindData(JsonPhAlbums album) {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);

        titleTv.setText(album.getTitle());
//        bodyTv.setText(album.getBody());

    }
    public void bindData(JsonPhTodo toDo) {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);

        titleTv.setText(toDo.getTitle());
//        bodyTv.setText(toDo.getBody());

    }
    public void bindData(JsonPhUsers user) {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);

//        titleTv.setText(user.getTitle());
//        bodyTv.setText(user.getBody());

    }

}
