package com.foodorder;
public class Pizza extends FoodItem {
    public Pizza() {
        super("Pizza", 250.0);
    }
    public String getDescription() {
        return "Pizza";
    }
}