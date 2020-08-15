package com.example.retrofit.gorest.model;

import com.google.gson.annotations.SerializedName;

public class Edit{

	@SerializedName("href")
	private String href;

	public String getHref(){
		return href;
	}
}