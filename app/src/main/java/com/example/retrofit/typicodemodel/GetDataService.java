package com.example.retrofit.typicodemodel;

import com.example.retrofit.typicodemodel.users.TypicodeUsers;

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

}