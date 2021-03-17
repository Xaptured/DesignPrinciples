package com.jagdeesh.builder.model;

import com.jagdeesh.builder.DAOImpl.ChickenBurger;
import com.jagdeesh.builder.DAOImpl.Coke;
import com.jagdeesh.builder.DAOImpl.Pepsi;
import com.jagdeesh.builder.DAOImpl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal prepareNonVegMeal (){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
