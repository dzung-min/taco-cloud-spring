package io.dzung.tacos.data;

import org.springframework.data.repository.CrudRepository;

import io.dzung.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
