package com.example.retrofit.typicode.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.typicode.model.TypicodeTodo;
import com.example.retrofit.R;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<TypicodeViewHolder> {
    List<TypicodeTodo> toDoList;
    public ToDoAdapter(List<TypicodeTodo> toDoList){
        this.toDoList = toDoList;
    }


    @NonNull
    @Override
    public TypicodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model, parent,false);
        return new TypicodeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypicodeViewHolder holder, int position) {
        final TypicodeTodo toDo = toDoList.get(position);
        holder.bindToDos(toDo);
    }

    @Override
    public int getItemCount() {
        return toDoList != null ? toDoList.size() : 0;
    }
}
