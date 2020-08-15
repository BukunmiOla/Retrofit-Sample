package com.example.retrofit.poke.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofit.R;
import com.example.retrofit.network.GetDataService;
import com.example.retrofit.network.RetrofitClientInstance;
import com.example.retrofit.poke.model.PokeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.retrofit.network.RetrofitClientInstance.POKE_COM;

public class PokeActivity extends AppCompatActivity {

    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        customRv = findViewById(R.id.display_rv);
        progressDialog = new ProgressDialog(PokeActivity.this);
        displayData();
    }

    private void displayData() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance(POKE_COM).create(GetDataService.class);
        Call<List<PokeModel>> call = service.getAllDittos();
        call.enqueue(new Callback<List<PokeModel>>() {
            @Override
            public void onResponse(Call<List<PokeModel>> call, Response<List<PokeModel>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<PokeModel>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(PokeActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<PokeModel> dataItemList) {
        PokeAdapter adapter = new PokeAdapter(dataItemList);
        customRv.setLayoutManager(new LinearLayoutManager(PokeActivity.this));
        customRv.setAdapter(adapter);
    }
}