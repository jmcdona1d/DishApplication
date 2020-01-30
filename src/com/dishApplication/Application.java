package com.dishApplication;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner cli = new Scanner(System.in);
        DishList list = new DishList();

        System.out.println("Welcome to the Dish Tracker 3000");

        while (true) {
            System.out.println("Type a command: 'Add', 'Delete', 'View', 'Exit'");
            String input = cli.nextLine();

            switch (input) {

            case "Add":
                System.out.println("Enter name of the new dish");
                String nameAdd = cli.nextLine();
                list.addDish(new Dish(nameAdd));
                System.out.println("Added dish with Name: " + nameAdd);
                break;

            case "Delete":
                System.out.println("Enter name of the dish to delete");
                String nameDelete = cli.nextLine();
                boolean result = list.deleteDish(nameDelete);
                System.out.println(result ? "Deleted " + nameDelete : "Unable to find " + nameDelete);
                break;

            case "View":
                System.out.println("Displaying all saved dishes:");
                list.viewDishes();
                break;

            case "Exit":
                System.out.println("Closing Program");
                return;

            default:
                System.out.println("Command unknown - please enter a command from the provided list");
            }
        }
    }
}
