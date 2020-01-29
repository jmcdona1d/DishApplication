package com.dishApplication;

public class Application {

    public static void main(String[] args) {
	// write your code here
        DishList list = new DishList();
        Dish a = new Dish("Pizza");
        Dish b = new Dish("Pasta");
        Dish c = new Dish();

        list.addDish(a);
        list.addDish(b);
        list.addDish(c);
        list.addDish(new Dish());
        list.addDish(new Dish("pasta"));

        list.viewDishes();
        list.deleteDish("pasta");
        list.viewDishes();
    }
}
