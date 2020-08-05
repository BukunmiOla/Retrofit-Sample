package com.example.retrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.model.TypicodeTodo;
import com.example.retrofit.R;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    List<TypicodeTodo> toDoList;
    public ToDoAdapter(List<TypicodeTodo> toDoList){
        this.toDoList = toDoList;
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.typicode_other_view_model, parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        final TypicodeTodo toDo = toDoList.get(position);
        holder.bindToDoData(toDo);
    }

    @Override
    public int getItemCount() {
        return toDoList != null ? toDoList.size() : 0;
    }
}
