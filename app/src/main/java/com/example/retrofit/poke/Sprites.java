package com.example.retrofit.poke;

import com.google.gson.annotations.SerializedName;

public class Sprites{

	@SerializedName("back_shiny_female")
	private Object backShinyFemale;

	@SerializedName("back_female")
	private Object backFemale;

	@SerializedName("other")
	private Other other;

	@SerializedName("back_default")
	private String backDefault;

	@SerializedName("front_shiny_female")
	private Object frontShinyFemale;

	@SerializedName("front_default")
	private String frontDefault;

	@SerializedName("versions")
	private Versions versions;

	@SerializedName("front_female")
	private Object frontFemale;

	@SerializedName("back_shiny")
	private String backShiny;

	@SerializedName("front_shiny")
	private String frontShiny;

	public Object getBackShinyFemale(){
		return backShinyFemale;
	}

	public Object getBackFemale(){
		return backFemale;
	}

	public Other getOther(){
		return other;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public Versions getVersions(){
		return versions;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	public String getBackShiny(){
		return backShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}
}