package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class Version{

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