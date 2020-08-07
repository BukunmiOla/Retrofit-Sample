package com.example.retrofit;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.heroku.GetHerokuDataService;
import com.example.retrofit.heroku.HerokuAll;
import com.example.retrofit.heroku.HerokuCatFactAdapter;
import com.example.retrofit.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HerokuCatFactActivity extends AppCompatActivity {

    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        customRv = findViewById(R.id.display_rv);
        progressDialog = new ProgressDialog(HerokuCatFactActivity.this);
        displayData();
    }

    private void displayData() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetHerokuDataService service = RetrofitClientInstance.getHerokuClientInstance().create(GetHerokuDataService.class);
        Call<HerokuAll> call = service.getAllFacts();
        call.enqueue(new Callback<HerokuAll>() {
            @Override
            public void onResponse(Call<HerokuAll> call, Response<HerokuAll> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<HerokuAll> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(HerokuCatFactActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(HerokuAll body) {
        HerokuCatFactAdapter adapter = new HerokuCatFactAdapter(body);
        customRv.setLayoutManager(new LinearLayoutManager(HerokuCatFactActivity.this));
        customRv.setAdapter(adapter);
    }
}