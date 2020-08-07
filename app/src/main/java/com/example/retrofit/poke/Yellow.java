package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class Yellow{

	@SerializedName("front_gray")
	private String frontGray;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("back_gray")
	private String backGray;

	@SerializedName("front_default")
	private String frontDefault;

	public String getFrontGray(){
		return frontGray;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public String getBackGray(){
		return backGray;
	}

	public String getFrontDefault(){
		return frontDefault;
	}
}