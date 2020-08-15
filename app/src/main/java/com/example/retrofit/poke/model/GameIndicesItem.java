package com.example.retrofit.poke.model;

import com.google.gson.annotations.SerializedName;

public class GameIndicesItem{

	@SerializedName("game_index")
	private int gameIndex;

	@SerializedName("version")
	private Version version;

	public int getGameIndex(){
		return gameIndex;
	}

	public Version getVersion(){
		return version;
	}
}