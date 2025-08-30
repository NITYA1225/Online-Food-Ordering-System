package com.foodorder;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart=new Cart();
        boolean run=true;
        while(run){
            System.out.println("\n====Online Food Ordering ====");
            System.out.println("1. view manu");
            System.out.println("2. view cart");
            System.out.println("3. checkout order");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Pizza- Rs250");
                    System.out.println("2. Burger- Rs150");
                    System.out.println("3. Fries- Rs100");
                    System.out.println("Select your item:");
                    int item=sc.nextInt();
                    switch (item) {
                        case 1:
                            cart.addItems(new Pizza());
                        case 2:
                            cart.addItems(new Burger());
                        case 3:
                            cart.addItems(new Fries());
                        default:
                            System.out.println("Invalid choice");

                    }
                    break;
                case 2:
                    System.out.println("\nCart:");
                    for(FoodItem item:cart.getItems()) {
                        System.out.println(item.getName() + "(Rs" + item.getPrice() + ")");
                    }
                    System.out.println("Total: Rs"+cart.getTotalPrice());
                    break;
                case 3:
                    double total=cart.getTotalPrice();
                    if(total==0) {
                        System.out.println("Cart is empty");
                        break;
                    }
                    System.out.println("Total price: Rs"+total);
                    System.out.println("Make payment:");
                    CashPayment();
                    if(payment!=null) {
                        payment.pay(total);
                        cart.clear();
                        System.out.println("Payment successful");
                    }
                    else {
                        System.out.println("Payment failed");
                    }
                    break;
                    case 4:
                        run=false;
                        break;
                        default:
                        System.out.println("Invalid choice");
            }
        }
    }
}