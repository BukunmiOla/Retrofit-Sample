package com.example.retrofit.heroku.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.heroku.model.AllItem;

public class HerokuViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTv, bodyTv;

    public HerokuViewHolder(@NonNull View itemView) {
        super(itemView);

    }


    private void getViews() {
        titleTv = itemView.findViewById(R.id.post_title_tv);
        bodyTv = itemView.findViewById(R.id.post_body_tv);
    }



    public void bindFacts(AllItem fact) {
        getViews();
        titleTv.setText(fact.getText());
        String info = "Posted by " + fact.getUser() + "\nUpvotes: " + fact.getUpvotes();
        bodyTv.setText(info);
    }
}
