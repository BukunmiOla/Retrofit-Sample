package com.example.retrofit.heroku.model;

import com.google.gson.annotations.SerializedName;

public class AllItem{

	@SerializedName("upvotes")
	private int upvotes;

	@SerializedName("userUpvoted")
	private Object userUpvoted;

	@SerializedName("_id")
	private String id;

	@SerializedName("text")
	private String text;

	@SerializedName("type")
	private String type;

	@SerializedName("user")
	private User user;

	public int getUpvotes(){
		return upvotes;
	}

	public Object getUserUpvoted(){
		return userUpvoted;
	}

	public String getId(){
		return id;
	}

	public String getText(){
		return text;
	}

	public String getType(){
		return type;
	}

	public String getUser(){
		return user.getName();
	}
}