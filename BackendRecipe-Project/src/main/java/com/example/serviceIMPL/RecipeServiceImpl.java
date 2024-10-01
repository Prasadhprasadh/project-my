package com.example.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Recipe;
import com.example.repository.RecipeRepository;
import com.example.service.RecipeService;

@Service
public class RecipeServiceImpl implements RecipeService{

	@Autowired
	private RecipeRepository reciperepository; 	
	@Override
	public List<Recipe> getallrecipe() {
		return reciperepository.findAll();
	}

	@Override
	public Recipe saverecipe(Recipe recipe) {
		return reciperepository.save(recipe);
	}

	@Override
	public void updaterecipe(Recipe recipe) {
		reciperepository.save(recipe);
	}

	@Override
	public void deleterecipe(int recipeId) {
		reciperepository.deleteById(recipeId);
	}

	@Override
	public Recipe getrecipedetails(int recipeId) {
		return reciperepository.findById(recipeId).get();
	}

}
