package com.dishApplication;

import java.util.ArrayList;
import java.util.HashMap;

//Dish class
public class Dish {

    private String name;

    private HashMap<String, Integer> ingredients;

    public Dish(String name, HashMap<String, Integer> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + " | Made with: " +ingredients.toString();
    }
}
