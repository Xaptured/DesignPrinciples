package com.jagdeesh.builder.app;

import com.jagdeesh.builder.model.Meal;
import com.jagdeesh.builder.model.MealBuilder;

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		//Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal vegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		}
}
