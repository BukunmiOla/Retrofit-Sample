package com.example.retrofit.Model;

import com.example.retrofit.Model.users.JsonPhUsers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/posts")
    Call<List<JsonPhPosts>> getAllPosts();

    @GET("/comments")
    Call<List<JsonPhComments>> getAllComments();

    @GET("/albums")
    Call<List<JsonPhAlbums>> getAllAlbums();

    @GET("/photos")
    Call<List<JsonPhPhotos>> getAllPhotos();

    @GET("/todos")
    Call<List<JsonPhTodo>> getAllTodo();

    @GET("/users")
    Call<List<JsonPhUsers>> getAllUsers();

}