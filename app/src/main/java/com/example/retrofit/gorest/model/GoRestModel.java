package com.example.retrofit.gorest.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GoRestModel{

	@SerializedName("result")
	private List<ResultItem> result;

	@SerializedName("_meta")
	private Meta meta;

	public List<ResultItem> getResult(){
		return result;
	}

	public Meta getMeta(){
		return meta;
	}
}