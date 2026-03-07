package io.dzung.tacos.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import io.dzung.tacos.Ingredient;
import io.dzung.tacos.data.IngredientRepository;
import io.dzung.tacos.data.JdbcIngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
	private final IngredientRepository ingredientRepository;

	public IngredientByIdConverter(JdbcIngredientRepository jdcbIngredientRepository) {
		this.ingredientRepository = jdcbIngredientRepository;
	}

	@Override
	@Nullable
	public Ingredient convert(String id) {
		return ingredientRepository.findById(id).orElse(null);
	}
}
