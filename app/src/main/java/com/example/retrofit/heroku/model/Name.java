package com.example.retrofit.heroku.model;

import com.google.gson.annotations.SerializedName;

public class Name{

	@SerializedName("last")
	private String last;

	@SerializedName("first")
	private String first;

	public String getLast(){
		return last;
	}

	public String getFirst(){
		return first;
	}
}