package com.example.retrofit.typicode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.users.TypicodeUsers;
import com.example.retrofit.R;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<TypicodeViewHolder> {
    List<TypicodeUsers> usersList;
    public UsersAdapter(List<TypicodeUsers> userList){
        this.usersList = userList;
    }

    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {
        final TypicodeUsers user = usersList.get(position);
        holder.bindUserData(user);
    }

    @Override
    public int getItemCount() {
        return usersList != null ? usersList.size() : 0;
    }
}
