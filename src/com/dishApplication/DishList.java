package com.dishApplication;

import java.util.HashMap;
import static java.util.Objects.isNull;

//List of dishes class
public class DishList {

    //Dishes mapped by their name for O(1) access
    private HashMap<String, Dish> dishes;

    public DishList() {
        dishes = new HashMap<>();
    }

    public void addDish(Dish dish) {
        dishes.put(dish.getName(), dish);
    }

    public void viewDishes() {
        System.out.println("---------------");
        for (Dish d : dishes.values()) {
            System.out.println(d.getName());
        }
        System.out.println("---------------");
    }

    //Removes dish from HashMap - return true on success
    //If no dish is removed - return false
    public boolean deleteDish(String name) {
        Dish removed = dishes.remove(name);
        return !isNull(removed);
    }
}
