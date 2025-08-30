package com.foodorder;
import java.util.ArrayList;
import java.util.List;
public class Cart {
    private List<FoodItem> items=new ArrayList<>();
    public void addItem(FoodItem item) {
        items.add(item);
    }
    public List<com.foodorder.FoodItem> getItems() {
        return new ArrayList<>(items);
    }
    public double getTotalPrice() {
        double total=0;
        for(com.foodorder.FoodItem item:items){
            total+=item.getPrice();
        }
        return total;
    }
    public void clear(){
        items.clear();
    }
}