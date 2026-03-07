package io.dzung.tacos.data;

import java.util.Optional;

import io.dzung.tacos.Ingredient;

public interface IngredientRepository {
	public Iterable<Ingredient> findAll();

	public Optional<Ingredient> findById(String id);

	public Ingredient save(Ingredient ingredient);
}
