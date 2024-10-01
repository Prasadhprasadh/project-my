package com.example.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="recipe")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int recipeId;
	
	@Column
	private  String name;
	
	@Column
	@JsonFormat
	private LocalDate created;
	
	@Column
	private boolean veg;
	
	@Column
	private int servings;
	
	@Column
	private String instructions;
	
	@OneToMany(targetEntity=Ingredients.class, cascade=CascadeType.ALL)
	@JoinColumn(name="Ri_fk",referencedColumnName="recipeId")
	private List<Ingredients> ingredients;

	public Recipe(String name, LocalDate created, boolean veg, int servings, String instructions,
			List<Ingredients> ingredients) {
		super();
		this.name = name;
		this.created = created;
		this.veg = veg;
		this.servings = servings;
		this.instructions = instructions;
		this.ingredients = ingredients;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getServings() {
		return servings;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	
	
}
