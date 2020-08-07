package com.example.retrofit.typicodemodel;

import com.google.gson.annotations.SerializedName;

public class TypicodePosts {

	@SerializedName("userId")
	private int userId;

	@SerializedName("title")
	private String title;

	@SerializedName("id")
	private int id;

	@SerializedName("body")
	private String body;

//	public TypicodePosts(int userId,  String title, int id, String body) {
//		this.userId = userId;
//		this.id = id;
//		this.title = title;
//		this.body = body;
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

	public String getBody(){
		return body;
	}
}