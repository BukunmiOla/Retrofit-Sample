package com.example.retrofit.poke;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PokeModel{

	@SerializedName("location_area_encounters")
	private String locationAreaEncounters;

	@SerializedName("types")
	private List<TypesItem> types;

	@SerializedName("base_experience")
	private int baseExperience;

	@SerializedName("held_items")
	private List<HeldItemsItem> heldItems;

	@SerializedName("weight")
	private int weight;

	@SerializedName("is_default")
	private boolean isDefault;

	@SerializedName("sprites")
	private Sprites sprites;

	@SerializedName("abilities")
	private List<AbilitiesItem> abilities;

	@SerializedName("game_indices")
	private List<GameIndicesItem> gameIndices;

	@SerializedName("species")
	private Species species;

	@SerializedName("stats")
	private List<StatsItem> stats;

	@SerializedName("moves")
	private List<MovesItem> moves;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("forms")
	private List<FormsItem> forms;

	@SerializedName("height")
	private int height;

	@SerializedName("order")
	private int order;

	public String getLocationAreaEncounters(){
		return locationAreaEncounters;
	}

	public List<TypesItem> getTypes(){
		return types;
	}

	public int getBaseExperience(){
		return baseExperience;
	}

	public List<HeldItemsItem> getHeldItems(){
		return heldItems;
	}

	public int getWeight(){
		return weight;
	}

	public boolean isIsDefault(){
		return isDefault;
	}

	public Sprites getSprites(){
		return sprites;
	}

	public List<AbilitiesItem> getAbilities(){
		return abilities;
	}

	public List<GameIndicesItem> getGameIndices(){
		return gameIndices;
	}

	public Species getSpecies(){
		return species;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	public List<MovesItem> getMoves(){
		return moves;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public List<FormsItem> getForms(){
		return forms;
	}

	public int getHeight(){
		return height;
	}

	public int getOrder(){
		return order;
	}
}