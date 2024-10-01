package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Recipe;
import com.example.exception.RecipeNotFoundException;
import com.example.repository.RecipeRepository;
import com.example.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

	@Autowired
	private RecipeService recipeservice;
	@Autowired
	private RecipeRepository reciperepository;
	
	@GetMapping("/allrecipes")
	public ResponseEntity<?> getallrecipes() throws RecipeNotFoundException {
		if( !reciperepository.findAll().isEmpty()) {
			return new ResponseEntity<>(recipeservice.getallrecipe(),HttpStatus.OK);
		}
		else {
			throw new RecipeNotFoundException("recipe is not found ");
		}
	}
	
	@PostMapping("/addrecipe")
	public ResponseEntity<?> createrecipe(@RequestBody Recipe recipe) throws RecipeNotFoundException{
		Optional<Recipe> opt=reciperepository.findByName(recipe.getName());
		
		if(opt.isPresent()) {
			throw new RecipeNotFoundException("recipe is already present");
		}
		else {
			recipeservice.saverecipe(recipe);
			return new ResponseEntity<>("Recipe is added ",HttpStatus.CREATED);
		}
	}
	
	@PutMapping("/updaterecipe/{recipeId}")
	public ResponseEntity<String> updaterecipe(@RequestBody Recipe recipe) throws RecipeNotFoundException{
		if(reciperepository.existsById(recipe.getRecipeId())) {
			recipeservice.updaterecipe(recipe);
			return new ResponseEntity<>("Recipe Id "+recipe.getRecipeId()+" is updated successfully",HttpStatus.ACCEPTED);
		}
		else {
			throw new RecipeNotFoundException("Recipe Id "+recipe.getRecipeId()+" is not found");
		}
	}
	
	@DeleteMapping("/deleterecipe/{recipeId}")
	public ResponseEntity<String> deleterecipe(@PathVariable("recipeId") int recipeId) throws RecipeNotFoundException{
		Optional<Recipe> opt=reciperepository.findById(recipeId);
		
		if(opt.isPresent()) {
			recipeservice.deleterecipe(recipeId);
			return new ResponseEntity<>("Recipe Id "+recipeId+" is deleted ",HttpStatus.OK);
		}
		else {
			throw new RecipeNotFoundException("RecipeId is not found ");
		}
	}
	
}
