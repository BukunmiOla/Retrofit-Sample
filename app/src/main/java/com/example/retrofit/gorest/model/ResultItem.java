package com.example.retrofit.gorest.model;

import com.google.gson.annotations.SerializedName;

public class ResultItem{

	@SerializedName("website")
	private String website;

	@SerializedName("address")
	private String address;

	@SerializedName("gender")
	private String gender;

	@SerializedName("phone")
	private String phone;

	@SerializedName("_links")
	private Links links;

	@SerializedName("dob")
	private String dob;

	@SerializedName("last_name")
	private String lastName;

	@SerializedName("id")
	private String id;

	@SerializedName("first_name")
	private String firstName;

	@SerializedName("email")
	private String email;

	@SerializedName("status")
	private String status;

	public String getWebsite(){
		return website;
	}

	public String getAddress(){
		return address;
	}

	public String getGender(){
		return gender;
	}

	public String getPhone(){
		return phone;
	}

	public Links getLinks(){
		return links;
	}

	public String getDob(){
		return dob;
	}

	public String getLastName(){
		return lastName;
	}

	public String getId(){
		return id;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getEmail(){
		return email;
	}

	public String getStatus(){
		return status;
	}
}