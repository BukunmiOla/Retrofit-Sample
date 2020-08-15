package com.example.retrofit.poke.model;

import com.google.gson.annotations.SerializedName;

public class Versions{

	@SerializedName("generation-i")
	private GenerationI generationI;

	public GenerationI getGenerationI(){
		return generationI;
	}
}