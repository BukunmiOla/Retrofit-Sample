package com.example.retrofit.heroku.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.retrofit.R;
import com.example.retrofit.heroku.model.AllItem;
import com.example.retrofit.heroku.model.HerokuAll;
import java.util.List;
public class HerokuCatFactAdapter extends RecyclerView.Adapter<HerokuViewHolder> {

    HerokuAll facts;
    List<AllItem> factsList;

    public HerokuCatFactAdapter(HerokuAll facts) {
        this.facts = facts;
        factsList = facts.getAll();
    }

    @NonNull
    @Override
    public HerokuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.others_view_model,parent,false);
        return new HerokuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HerokuViewHolder holder, int position) {
        final AllItem fact = factsList.get(position);
        holder.bindFacts(fact);
    }


    @Override
    public int getItemCount() {
        return factsList != null? factsList.size():0;
    }
}