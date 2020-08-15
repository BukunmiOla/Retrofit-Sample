package com.example.retrofit.typicode.model;

import com.google.gson.annotations.SerializedName;

public class TypicodeAlbums {

	@SerializedName("userId")
	private int userId;

	@SerializedName("title")
	private String title;

	@SerializedName("id")
	private int id;

//	public TypicodeAlbums(int userId, int id, String title) {
//		this.userId = userId;
//		this.id = id;
//		this.title = title;
//	}

	public int getUserId(){
		return userId;
	}

	public String getTitle(){
		return title;
	}

	public int getId(){
		return id;
	}

}