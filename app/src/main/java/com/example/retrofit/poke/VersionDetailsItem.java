package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class VersionDetailsItem{

	@SerializedName("version")
	private Version version;

	@SerializedName("rarity")
	private int rarity;

	public Version getVersion(){
		return version;
	}

	public int getRarity(){
		return rarity;
	}
}