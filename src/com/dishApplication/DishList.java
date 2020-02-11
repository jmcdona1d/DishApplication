package com.dishApplication;

import java.util.ArrayList;
import java.util.HashMap;
import static java.util.Objects.isNull;

//List of dishes class
public class DishList {

    //Dishes mapped by their name for O(1) access
    private HashMap<String, Dish> dishes;
    private HashMap<String, Integer> usersIngredients;

    public DishList() {
        dishes = new HashMap<>();
        usersIngredients = new HashMap<>();
    }

    public void addDish(Dish dish) {
        dishes.put(dish.getName(), dish);
    }

    public void setUsersIngredients(HashMap<String, Integer> usersIngredients){
        this.usersIngredients = usersIngredients;
    }

    public void viewDishes() {
        System.out.println("---------------");
        for (Dish d : dishes.values()) {
            System.out.println(d.toString());
        }
        System.out.println("---------------");
    }

    //Removes dish from HashMap - return true on success
    //If no dish is removed - return false
    public boolean deleteDish(String name) {
        Dish removed = dishes.remove(name);
        return !isNull(removed);
    }

    public ArrayList<String> getDishesUser(){

        ArrayList<String> results = new ArrayList<>();
        ArrayList<Dish> dishVals = new ArrayList<>();


        boolean flag = true;
        dishVals.addAll(dishes.values());

        for(Dish d : dishVals){
            flag = true;
            for(String ingredient : d.getIngredients().keySet()){
                if(usersIngredients.containsKey(ingredient)) {
                    if(usersIngredients.get(ingredient) >= d.getIngredients().get(ingredient))
                        break;
                    else
                        flag = false;
                }
                else {
                    flag = false;
                }
            }
            if(flag) {
                results.add(d.getName());
            }
        }

        return results;
    }
}
