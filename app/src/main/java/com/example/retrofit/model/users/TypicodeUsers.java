package com.example.retrofit.model.users;

import com.google.gson.annotations.SerializedName;

public class TypicodeUsers {

	@SerializedName("website")
	private String website;

	@SerializedName("address")
	private Address address;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("company")
	private Company company;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("username")
	private String username;



	public String getWebsite(){
		return website;
	}

	public String getAddress(){

			String addressStr = address.getSuite()+ ", " + address.getStreet()+ ", " +address.getCity()+ ", GeoLocation:"
					+address.getGeo()+ ", Zip Code: " +address.getZipcode();


		return addressStr;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public String getCompany(){
		 String companyStr = company.getName() + ", " + company.getBs()  + ", " + company.getCatchPhrase();
		return companyStr;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}
}