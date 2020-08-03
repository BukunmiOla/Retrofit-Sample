package com.example.retrofit.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.Model.JsonPhPosts;
import com.example.retrofit.Model.JsonPhTodo;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<JsonPhTodo> toDoList;
    public ToDoAdapter(List<JsonPhTodo> toDoList){
        this.toDoList = toDoList;
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
