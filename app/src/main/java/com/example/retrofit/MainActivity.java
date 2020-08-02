package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofit.Model.GetDataService;
import com.example.retrofit.Model.JsonPhPhotos;
import com.example.retrofit.adapter.CustomAdapter;
import com.example.retrofit.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JsonPlaceholderActivity extends AppCompatActivity {

    CustomAdapter adapter;
    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_placeholder);

        progressDialog = new ProgressDialog(JsonPlaceholderActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<JsonPhPhotos>> call = service.getAllPhotos();
        call.enqueue(new Callback<List<JsonPhPhotos>>() {
            @Override
            public void onResponse(Call<List<JsonPhPhotos>> call, Response<List<JsonPhPhotos>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<JsonPhPhotos>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(JsonPlaceholderActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<JsonPhPhotos> photoList) {
        customRv = findViewById(R.id.customRV);
        adapter = new CustomAdapter(this,photoList);
        customRv.setLayoutManager(new LinearLayoutManager(JsonPlaceholderActivity.this));
        customRv.setAdapter(adapter);

    }
}