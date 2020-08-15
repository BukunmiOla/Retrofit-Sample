package com.example.retrofit.heroku.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.retrofit.R;
import com.example.retrofit.typicode.ui.CustomViewHolder;
import java.util.List;
public class HerokuCatFactAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    HerokuAll facts;
    List<AllItem> factsList;

    public HerokuCatFactAdapter(HerokuAll facts) {
        this.facts = facts;
        factsList = facts.getAll();
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        final AllItem fact = factsList.get(position);
        holder.bindHerokuFacts(fact);

    }

    @Override
    public int getItemCount() {
        return factsList != null? factsList.size():0;
    }
}