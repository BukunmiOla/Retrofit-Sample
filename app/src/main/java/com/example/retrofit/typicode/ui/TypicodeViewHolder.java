package com.example.retrofit.typicode.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodeAlbums;
import com.example.retrofit.typicode.model.TypicodeComments;
import com.example.retrofit.typicode.model.TypicodePhotos;
import com.example.retrofit.typicode.model.TypicodePosts;
import com.example.retrofit.typicode.model.TypicodeTodo;
import com.example.retrofit.typicode.model.users.TypicodeUsers;
import com.example.retrofit.R;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

public class TypicodeViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv, bodyTv;

    public TypicodeViewHolder(@NonNull View itemView) {
        super(itemView);

    }

    public void bindPhotos(Context context, TypicodePhotos photo) {
        titleTv = itemView.findViewById(R.id.title_tv);
        ImageView photoIv = itemView.findViewById(R.id.photo_image_view);


        titleTv.setText(photo.getTitle());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(photo.getThumbnailUrl())
                .placeholder((R.drawable.ic_launcher_background))
                .error(R.drawable.ic_launcher_background)
                .into(photoIv);

    }

    public void bindPosts(TypicodePosts post) {
        getViews();

        titleTv.setText(post.getTitle());
        bodyTv.setText(post.getBody());

    }

    private void getViews() {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);
    }

    public void bindComments(TypicodeComments comment) {
        getViews();

        titleTv.setText(comment.getName());
        bodyTv.setText(comment.getBody());

    }

    public void bindAlbums(TypicodeAlbums album) {
        bodyTv = itemView.findViewById(R.id.post_body_tv);

        bodyTv.setText(album.getTitle());

    }

    public void bindToDos(TypicodeTodo toDo) {

        getViews();

        titleTv.setText(toDo.getTitle());
        if (toDo.isCompleted()){
            bodyTv.setText("Completed");
            bodyTv.setTextColor(Color.parseColor("#00ff00"));
        }
        else {
            bodyTv.setText("Uncompleted");
            bodyTv.setTextColor(Color.parseColor("#ff0000"));

        }

    }

    public void bindUserData(TypicodeUsers user) {
        getViews();

        String header ="Name: " +user.getName()+ "\nCompany: "+user.getCompany();
        titleTv.setText(header);
        String body = "Phone: "+ user.getPhone() + "\nAddress: " +user.getAddress();
        bodyTv.setText(body);

    }


}
