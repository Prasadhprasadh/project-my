package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer>{

	@Query("select r from Recipe r where r.name=:name")
	public Optional<Recipe> findByName(@Param ("name") String name);

}
