package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class GenerationI{

	@SerializedName("yellow")
	private Yellow yellow;

	@SerializedName("red-blue")
	private RedBlue redBlue;

	public Yellow getYellow(){
		return yellow;
	}

	public RedBlue getRedBlue(){
		return redBlue;
	}
}