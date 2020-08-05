package com.example.retrofit.model.users;

import com.google.gson.annotations.SerializedName;

public class Address{

	@SerializedName("zipcode")
	private String zipcode;

	@SerializedName("geo")
	private Geo geo;

	@SerializedName("suite")
	private String suite;

	@SerializedName("city")
	private String city;

	@SerializedName("street")
	private String street;

//	public Address(String zipcode, Geo geo, String suite, String city,  String street) {
//		this.zipcode = zipcode;
//		this.geo = geo;
//		this.suite = suite;
//		this.city = city;
//		this.street = street;
//	}

	public String getZipcode(){
		return zipcode;
	}

	public String getGeo(){

		return (geo.getLat()+ "(Lat) "+geo.getLng()+"(Lng)" );
	}

	public String getSuite(){
		return suite;
	}

	public String getCity(){
		return city;
	}

	public String getStreet(){
		return street;
	}
}