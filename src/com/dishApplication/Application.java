package com.dishApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner cli = new Scanner(System.in);
        DishList dishes = loadTestData();
        System.out.println("\nWelcome to the Dish Tracker 3000!");

        while (true) {
            System.out.println("\nType a command: ('Add', 'Delete', 'View', 'Exit', 'Input')");
            String input = cli.nextLine();

            switch (input) {

            case "Add":
                System.out.println("\nEnter name of the new dish:");
                String nameAdd = cli.nextLine();
                ArrayList<String> ingredients = new ArrayList<>();
                while(true){
                    System.out.println("\nEnter Ingredient name:");
                    String ingredient = cli.nextLine();
                    ingredients.add(ingredient);
                    System.out.println("\nContinue adding ingredients?");
                    String response = cli.nextLine();
                    if(!response.equals("yes"))
                        break;
                }

                dishes.addDish(new Dish(nameAdd, ingredients));
                System.out.println("\nAdded dish with Name: " + nameAdd);
                break;

            case "Delete":
                System.out.println("\nEnter name of the dish to delete");
                String nameDelete = cli.nextLine();
                System.out.println(
                        dishes.deleteDish(nameDelete) ? "\nDeleted " + nameDelete +"\n" : "\nUnable to find " + nameDelete);
                break;

            case "View":
                System.out.println("\nDisplaying all saved dishes:");
                dishes.viewDishes();
                break;

            case "Exit":
                System.out.println("\nClosing Program");
                return;

            case "Input":
                ArrayList<String> ingredientsUser = new ArrayList<>();
                while(true){
                    System.out.println("\nEnter Ingredient name:");
                    String ingredientUser = cli.nextLine();
                    ingredientsUser.add(ingredientUser);
                    System.out.println("\nContinue adding ingredients?");
                    String response = cli.nextLine();
                    if(!response.equals("yes"))
                        break;
                }
                dishes.setUsersIngredients(ingredientsUser);
                ArrayList<String> dishesToMake = dishes.getDishesUser();

                System.out.println("\nDishes you can make:");
                for(String s : dishesToMake)
                    System.out.println(s);
                break;


            default:
                System.out.println("\nCommand unknown - please enter a command from the provided list");
            }
        }
    }

    // Method used to load test data to save initialization time while demoing
    private static DishList loadTestData() {
        DishList dishes = new DishList();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("gravy");
        list1.add("cheese");
        list1.add("Fries");
        list1.add("gravy");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("meat");
        list2.add("veggie");

        dishes.addDish(new Dish("Peameal Bacon Sandwich", list2));
        dishes.addDish(new Dish("Poutine", list1));
        dishes.addDish(new Dish("Butter Tart", list2));
        return dishes;
    }
}
