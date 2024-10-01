package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ingredients")
public class Ingredients {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String ingredientsList;

	public Ingredients(int id, String ingredientsList) {
		super();
		this.id = id;
		this.ingredientsList = ingredientsList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(String ingredientsList) {
		this.ingredientsList = ingredientsList;
	}
	
	
}
