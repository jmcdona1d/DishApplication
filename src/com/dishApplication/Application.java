package com.dishApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner cli = new Scanner(System.in);
        DishList dishes = loadTestData();
        System.out.println("\nWelcome to the Dish Tracker 3000!");

        while (true) {
            System.out.println("\nType a command: ('Add', 'Delete', 'View', 'Exit')");
            String input = cli.nextLine();

            switch (input) {

            case "Add":
                System.out.println("\nEnter name of the new dish:");
                String nameAdd = cli.nextLine();
                dishes.addDish(new Dish(nameAdd));
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

            default:
                System.out.println("\nCommand unknown - please enter a command from the provided list");
            }
        }
    }

    // Method used to load test data to save initialization time while demoing
    private static DishList loadTestData() {
        DishList dishes = new DishList();
        dishes.addDish(new Dish("Peameal Bacon Sandwich"));
        dishes.addDish(new Dish("Poutine"));
        dishes.addDish(new Dish("Butter Tart"));
        return dishes;
    }
}
