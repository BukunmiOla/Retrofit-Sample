package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class Other{

	@SerializedName("dream_world")
	private DreamWorld dreamWorld;

	public DreamWorld getDreamWorld(){
		return dreamWorld;
	}
}