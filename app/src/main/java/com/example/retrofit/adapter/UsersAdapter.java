package com.example.retrofit.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.retrofit.Model.users.JsonPhUsers;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<JsonPhUsers> usersList;
    public UsersAdapter(List<JsonPhUsers> userList){
        this.usersList = userList;
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
