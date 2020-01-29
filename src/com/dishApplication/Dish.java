package com.dishApplication;

//Dish Object
public class Dish {

    private String name;

    public Dish(String name){
        this.name = name;
    }

    public Dish(){
        this.name = "No name";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
