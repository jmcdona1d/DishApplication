package com.dishApplication;

import java.util.ArrayList;

//List of dishes object
public class DishList {

    private ArrayList<Dish> dishes;

    public DishList() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void viewDishes() {
        System.out.println("---------------");
        for (Dish d : dishes) {
            System.out.println(d.getName());
        }
        System.out.println("---------------");
    }

    // Deletes dish by first occurrence of matching name
    // Returns true if dish deleted and false if not found
    public boolean deleteDish(String name) {
        for (Dish d : dishes) {
            if (d.getName().equals(name)) {
                dishes.remove(d);
                return true;
            }
        }
        return false;
    }
}
