package com.dishApplication;

import java.util.ArrayList;

//List of dishes object
public class DishList {

    private ArrayList<Dish> dishes;

    public DishList(){
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public void viewDishes(){
        System.out.println("---------------");
        for(Dish d : dishes){
            System.out.println(d.getName());
        }
        System.out.println("---------------");
    }

    //Deletes dish by object
    public void deleteDish(Dish dish){
        dishes.remove(dish);
    }

    //Deletes dish by first occurrence of matching name
    public void deleteDish(String name){
        for(Dish d: dishes){
            if (d.getName().equals(name)) {
                dishes.remove(d);
                break;
            }
        }
    }
}
