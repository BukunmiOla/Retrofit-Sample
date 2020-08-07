package com.example.retrofit.heroku;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetHerokuDataService {
    @GET("/facts")
    Call<HerokuAll> getAllFacts();

}

