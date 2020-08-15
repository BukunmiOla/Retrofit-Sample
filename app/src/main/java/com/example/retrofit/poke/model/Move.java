package com.example.retrofit.poke.model;

import com.google.gson.annotations.SerializedName;

public class Move{

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}
}