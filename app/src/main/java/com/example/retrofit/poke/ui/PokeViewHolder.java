package com.example.retrofit.poke.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.poke.model.PokeModel;

public class PokeViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv, bodyTv;

    public PokeViewHolder(@NonNull View itemView) {
        super(itemView);

    }


    private void getViews() {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);
    }

    public void bindData(PokeModel comment) {
        getViews();

        titleTv.setText(comment.getName());
       // bodyTv.setText(comment.getBody());

    }
}
