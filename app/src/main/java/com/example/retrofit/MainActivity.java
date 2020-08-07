package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.typicode_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSelected = new Intent(MainActivity.this, TypicodeActivity.class);
                startActivity(goToSelected);
            }
        });

        findViewById(R.id.dummy_api_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSelected = new Intent(MainActivity.this, DummyActivity.class);
                startActivity(goToSelected);
            }
        });

        findViewById(R.id.poke_api_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSelected = new Intent(MainActivity.this, PokeActivity.class);
                startActivity(goToSelected);
            }
        });

        findViewById(R.id.go_rest_api_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSelected = new Intent(MainActivity.this, GoRestActivity.class);
                startActivity(goToSelected);
            }
        });

        findViewById(R.id.heroku_cat_fact_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSelected = new Intent(MainActivity.this, HerokuCatFactActivity.class);
                startActivity(goToSelected);
            }
        });
    }
}