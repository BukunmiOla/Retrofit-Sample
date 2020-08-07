package com.example.retrofit.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static Retrofit retrofitTY;
    private static final String TYPICODE_COM = "https://jsonplaceholder.typicode.com";
    private static Retrofit retrofitDM;
    private static final String DUMMY_COM = "http://dummy.restapiexample.com";
    private static Retrofit retrofitHCF;
    private static final String HEROKU_COM = "https://cat-fact.herokuapp.com/";
    private static Retrofit retrofitP;
    private static final String POKE_COM = "https://pokeapi.co";

    public static Retrofit getTypicodeClientInstance() {
        if (retrofitTY == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.level(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

//        httpClient.enableTls12()
            httpClient.connectTimeout(30, TimeUnit.SECONDS);
            httpClient.readTimeout(30, TimeUnit.SECONDS);
            httpClient.writeTimeout(30, TimeUnit.SECONDS);
            httpClient.addInterceptor(logging);


            retrofitTY = new retrofit2.Retrofit.Builder()
                    .baseUrl(TYPICODE_COM)
                    .client(httpClient.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitTY;
    }

    public static Retrofit getDummyClientInstance() {
        if (retrofitDM == null) {

            retrofitDM = new retrofit2.Retrofit.Builder()
                    .baseUrl(DUMMY_COM)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitDM;
    }

    public static Retrofit getHerokuClientInstance() {
        if (retrofitHCF == null) {

            retrofitHCF = new retrofit2.Retrofit.Builder()
                    .baseUrl(HEROKU_COM)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitHCF;
    }

    public static Retrofit getPokeClientInstance() {
        if (retrofitP == null) {

            retrofitP = new retrofit2.Retrofit.Builder()
                    .baseUrl(POKE_COM)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitP;
    }
}
