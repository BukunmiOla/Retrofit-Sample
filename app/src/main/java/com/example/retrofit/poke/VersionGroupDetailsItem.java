package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class VersionGroupDetailsItem{

	@SerializedName("level_learned_at")
	private int levelLearnedAt;

	@SerializedName("version_group")
	private VersionGroup versionGroup;

	@SerializedName("move_learn_method")
	private MoveLearnMethod moveLearnMethod;

	public int getLevelLearnedAt(){
		return levelLearnedAt;
	}

	public VersionGroup getVersionGroup(){
		return versionGroup;
	}

	public MoveLearnMethod getMoveLearnMethod(){
		return moveLearnMethod;
	}
}