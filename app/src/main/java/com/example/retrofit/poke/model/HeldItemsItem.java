package com.example.retrofit.poke.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HeldItemsItem{

	@SerializedName("item")
	private Item item;

	@SerializedName("version_details")
	private List<VersionDetailsItem> versionDetails;

	public Item getItem(){
		return item;
	}

	public List<VersionDetailsItem> getVersionDetails(){
		return versionDetails;
	}
}