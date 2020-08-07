package com.example.retrofit.heroku;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("name")
	private Name name;

	@SerializedName("_id")
	private String id;

	public String getName(){
		return (name.getFirst() + " " + name.getLast());
	}

	public String getId(){
		return id;
	}
}