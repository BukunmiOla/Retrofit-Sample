package com.example.retrofit.dummy;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDummyDataService {

    @GET("/api/v1/employee")
    Call<List<DataItem>> getData();
}
