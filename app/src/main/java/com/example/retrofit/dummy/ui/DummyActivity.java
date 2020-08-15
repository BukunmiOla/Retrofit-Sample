package com.example.retrofit.dummy.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofit.R;
import com.example.retrofit.dummy.model.DataItem;
import com.example.retrofit.dummy.model.DummyAdapter;
import com.example.retrofit.network.GetDataService;
import com.example.retrofit.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DummyActivity extends AppCompatActivity {

    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        customRv = findViewById(R.id.display_rv);
        progressDialog = new ProgressDialog(DummyActivity.this);
        displayData();

    }

    private void displayData() {
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getClientInstance("http://dummy.restapiexample.com").create(GetDataService.class);
        Call<List<DataItem>> call = service.getData();
        call.enqueue(new Callback<List<DataItem>>() {
            @Override
            public void onResponse(Call<List<DataItem>> call, Response<List<DataItem>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<DataItem>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(DummyActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<DataItem> dataItemList) {
        DummyAdapter adapter = new DummyAdapter(dataItemList);
        customRv.setLayoutManager(new LinearLayoutManager(DummyActivity.this));
        customRv.setAdapter(adapter);
    }
}