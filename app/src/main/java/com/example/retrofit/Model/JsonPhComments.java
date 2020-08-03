package com.example.retrofit.Model;

import com.google.gson.annotations.SerializedName;

public class JsonPhComments{

	@SerializedName("email")
	private String email;

	@SerializedName("id")
	private int id;

	@SerializedName("body")
	private String body;

	@SerializedName("postId")
	private int postID;

	@SerializedName("name")
	private String name;

//	public JsonPhComments(String email, int id, String body, int postID,  String name) {
//		this.email = email;
//		this.id = id;
//		this.body = body;
//		this.postID = postID;
//		this.name = name;
//	}

	public String getEmail(){
		return email;
	}

	public int getId(){
		return id;
	}

	public String getBody(){
		return body;
	}

	public int getPostID(){
		return postID;
	}

	public String getName(){
		return name;
	}
}