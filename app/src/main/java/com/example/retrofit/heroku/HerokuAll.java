package com.example.retrofit.heroku;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class HerokuAll{

	@SerializedName("all")
	public List<AllItem> all;

	public List<AllItem> getAll(){
		return all;
	}
}