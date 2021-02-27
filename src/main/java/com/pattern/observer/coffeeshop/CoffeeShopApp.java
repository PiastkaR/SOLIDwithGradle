package com.pattern.observer.coffeeshop;

import com.pattern.observer.coffeeshop.domain.Customer;
import com.pattern.observer.coffeeshop.subjects.CoffeeAttendant;

public class CoffeeShopApp {
    public static void main(String[] args) {


        Customer robert = new Customer("Robert", "French Vanilla");
        Customer bill = new Customer("Bill", "Hot Coffee");

        CoffeeAttendant coffeeAttendant = new CoffeeAttendant();
        coffeeAttendant.takeOrder(robert);
        coffeeAttendant.takeOrder(bill);

        // prepare drink
        coffeeAttendant.prepareDrink("French Vanilla");
        coffeeAttendant.prepareDrink("Hot Coffee");

        // order up...
        coffeeAttendant.callOutCompletedOrder();
    }
}
