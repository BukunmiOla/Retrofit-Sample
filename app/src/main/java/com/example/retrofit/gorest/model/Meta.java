package com.example.retrofit.gorest.model;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("pageCount")
	private int pageCount;

	@SerializedName("code")
	private int code;

	@SerializedName("perPage")
	private int perPage;

	@SerializedName("rateLimit")
	private RateLimit rateLimit;

	@SerializedName("success")
	private boolean success;

	@SerializedName("message")
	private String message;

	@SerializedName("totalCount")
	private int totalCount;

	@SerializedName("currentPage")
	private int currentPage;

	public int getPageCount(){
		return pageCount;
	}

	public int getCode(){
		return code;
	}

	public int getPerPage(){
		return perPage;
	}

	public RateLimit getRateLimit(){
		return rateLimit;
	}

	public boolean isSuccess(){
		return success;
	}

	public String getMessage(){
		return message;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public int getCurrentPage(){
		return currentPage;
	}
}