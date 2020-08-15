package com.example.retrofit.network;

import com.example.retrofit.dummy.model.DataItem;
import com.example.retrofit.heroku.model.HerokuAll;
import com.example.retrofit.poke.model.PokeModel;
import com.example.retrofit.typicode.model.TypicodeAlbums;
import com.example.retrofit.typicode.model.TypicodeComments;
import com.example.retrofit.typicode.model.TypicodePhotos;
import com.example.retrofit.typicode.model.TypicodePosts;
import com.example.retrofit.typicode.model.TypicodeTodo;
import com.example.retrofit.typicode.model.users.TypicodeUsers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/posts")
    Call<List<TypicodePosts>> getAllPosts();

    @GET("/comments")
    Call<List<TypicodeComments>> getAllComments();

    @GET("/albums")
    Call<List<TypicodeAlbums>> getAllAlbums();

    @GET("/photos")
    Call<List<TypicodePhotos>> getAllPhotos();

    @GET("/todos")
    Call<List<TypicodeTodo>> getAllTodo();

    @GET("/users")
    Call<List<TypicodeUsers>> getAllUsers();

    @GET("/api/v1/employee")
    Call<List<DataItem>> getData();

    @GET("/facts")
    Call<HerokuAll> getAllFacts();

    @GET ("/api/v2/pokemon/ditto")
    Call<List<PokeModel>> getAllDittos();

    @GET("/public-api/users?_format=json&access-token=LTbuDKQJvquB_elWKzYBXJec4miMQLMyRgye")
    HerokuAll get();

}