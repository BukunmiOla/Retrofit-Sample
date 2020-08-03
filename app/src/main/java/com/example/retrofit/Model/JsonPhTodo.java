package com.example.retrofit.Model;

import com.google.gson.annotations.SerializedName;

public class JsonPhTodo{

	@SerializedName("id")
	private int id;

	@SerializedName("completed")
	private boolean completed;

	@SerializedName("title")
	private String title;

	@SerializedName("userId")
	private int userId;

//	public JsonPhTodo(int userId, int id, String title, Boolean completed) {
//		this.userId = userId;
//		this.id = id;
//		this.title = title;
//		this.completed = completed;
//	}

	public int getId(){
		return id;
	}

	public boolean isCompleted(){
		return completed;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}
}