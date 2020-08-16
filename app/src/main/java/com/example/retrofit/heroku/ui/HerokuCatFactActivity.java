package com.example.retrofit.heroku.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.heroku.model.HerokuAll;
import com.example.retrofit.network.GetDataService;
import com.example.retrofit.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.retrofit.network.RetrofitClientInstance.HEROKU_COM;

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
        GetDataService service = RetrofitClientInstance.getClientInstance(HEROKU_COM).create(GetDataService.class);
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