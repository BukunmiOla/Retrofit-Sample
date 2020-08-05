package com.example.retrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofitTY;
    private static final String TYPICODE_COM = "https://jsonplaceholder.typicode.com";

    public static Retrofit getTypicodeClientInstance() {
        if (retrofitTY == null) {

            retrofitTY = new retrofit2.Retrofit.Builder()
                    .baseUrl(TYPICODE_COM)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitTY;
    }
}
