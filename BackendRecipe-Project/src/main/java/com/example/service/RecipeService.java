package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Recipe;

@Service
public interface RecipeService {

	public List<Recipe> getallrecipe();
	
	public Recipe saverecipe(Recipe recipe);
	
	public void updaterecipe(Recipe recipe);
	
	public void deleterecipe(int recipeId);
	
	public Recipe getrecipedetails(int recipeId);
	
}
