package com.dishApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner cli = new Scanner(System.in);
        DishList dishes = loadTestData();
        skipLine();
        System.out.println("Welcome to the Dish Tracker 3000!");
        skipLine();

        while (true) {
            System.out.println("Type a command: 'Add', 'Delete', 'View', 'Exit'");
            String input = cli.nextLine();
            skipLine();

            switch (input) {

            case "Add":
                System.out.println("Enter name of the new dish:");
                String nameAdd = cli.nextLine();
                skipLine();
                dishes.addDish(new Dish(nameAdd));
                System.out.println("Added dish with Name: " + nameAdd);
                skipLine();
                break;

            case "Delete":
                System.out.println("Enter name of the dish to delete");
                String nameDelete = cli.nextLine();
                skipLine();
                System.out.println(
                        dishes.deleteDish(nameDelete) ? "Deleted " + nameDelete : "Unable to find " + nameDelete);
                skipLine();
                break;

            case "View":
                System.out.println("Displaying all saved dishes:");
                dishes.viewDishes();
                skipLine();
                break;

            case "Exit":
                System.out.println("Closing Program");
                return;

            default:
                System.out.println("Command unknown - please enter a command from the provided list");
                skipLine();
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

    // Looks cleaner to write method name then have blank printlns everywhere
    private static void skipLine() {
        System.out.println("");
    }
}
