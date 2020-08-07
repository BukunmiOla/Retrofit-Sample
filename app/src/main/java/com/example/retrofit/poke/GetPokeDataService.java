package com.example.retrofit.poke;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetPokeDataService {
    @GET ("/api/v2/pokemon/ditto")
    Call<List<PokeModel>> getAllDittos();

}
