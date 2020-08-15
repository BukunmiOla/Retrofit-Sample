package com.example.retrofit.gorest.model;

import com.google.gson.annotations.SerializedName;

public class RateLimit{

	@SerializedName("limit")
	private int limit;

	@SerializedName("reset")
	private int reset;

	@SerializedName("remaining")
	private int remaining;

	public int getLimit(){
		return limit;
	}

	public int getReset(){
		return reset;
	}

	public int getRemaining(){
		return remaining;
	}
}