package com.example.retrofit.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    public static final String TYPICODE_COM = "https://jsonplaceholder.typicode.com";
    public static final String DUMMY_COM = "http://dummy.restapiexample.com";
    public static final String HEROKU_COM = "https://cat-fact.herokuapp.com/";
    public static final String POKE_COM = "https://pokeapi.co";

    private static OkHttpClient getHttpClient(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.connectTimeout(30, TimeUnit.SECONDS);
        httpClient.readTimeout(30, TimeUnit.SECONDS);
        httpClient.writeTimeout(30, TimeUnit.SECONDS);
        httpClient.addInterceptor(logging);
        return httpClient.build();
    }

    public static Retrofit getClientInstance(String baseURL) {
        return new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .client(getHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
    }

}
