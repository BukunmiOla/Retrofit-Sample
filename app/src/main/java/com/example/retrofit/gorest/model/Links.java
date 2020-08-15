package com.example.retrofit.gorest.model;

import com.google.gson.annotations.SerializedName;

public class Links{

	@SerializedName("edit")
	private Edit edit;

	@SerializedName("self")
	private Self self;

	@SerializedName("avatar")
	private Avatar avatar;

	public Edit getEdit(){
		return edit;
	}

	public Self getSelf(){
		return self;
	}

	public Avatar getAvatar(){
		return avatar;
	}
}