package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

public class GoRestActivity extends AppCompatActivity {
    RecyclerView customRv;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        customRv = findViewById(R.id.display_rv);
        progressDialog = new ProgressDialog(GoRestActivity.this);
//        displayData();
    }
}