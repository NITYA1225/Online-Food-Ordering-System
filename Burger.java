package com.foodorder;
public class Burger extends FoodItem {
    public Burger() {
        super("Burger", 150.0);
    }

    public String getDescription() {
        return "Burger";
    }
}