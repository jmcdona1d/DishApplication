package com.dishApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner cli = new Scanner(System.in);
        DishList dishes = loadTestData();
        System.out.println("\nWelcome to the Dish Tracker 3000! \n");

        while (true) {
            System.out.println("Type a command: 'Add', 'Delete', 'View', 'Exit'");
            String input = cli.nextLine();

            switch (input) {

            case "Add":
                System.out.println("\nEnter name of the new dish:");
                String nameAdd = cli.nextLine();
                dishes.addDish(new Dish(nameAdd));
                System.out.println("\nAdded dish with Name: " + nameAdd +"\n");
                break;

            case "Delete":
                System.out.println("\nEnter name of the dish to delete");
                String nameDelete = cli.nextLine();
                System.out.println(
                        dishes.deleteDish(nameDelete) ? "\nDeleted " + nameDelete +"\n" : "\nUnable to find " + nameDelete +"\n");
                break;

            case "View":
                System.out.println("\nDisplaying all saved dishes:");
                dishes.viewDishes();
                System.out.print("\n");
                break;

            case "Exit":
                System.out.println("\nClosing Program");
                return;

            default:
                System.out.println("\nCommand unknown - please enter a command from the provided list\n");
            }
        }
    }

    // Method used to load test data to save initialization time while demoing
    private static DishList loadTestData() {
        DishList dishes = new DishList();
        dishes.addDish(new Dish("Fried Chicken"));
        dishes.addDish(new Dish("Sushi"));
        dishes.addDish(new Dish("Poutine"));
        return dishes;
    }
}
