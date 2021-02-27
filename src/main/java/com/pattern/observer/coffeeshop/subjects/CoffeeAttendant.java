package com.pattern.observer.coffeeshop.subjects;

import com.pattern.observer.coffeeshop.observers.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class CoffeeAttendant {
    private List<Customer> customers;
    private List<String> completedDrinks;

    public CoffeeAttendant() {
        customers = new ArrayList<>();
        completedDrinks = new ArrayList<>();
    }

    public void takeOrder(Customer customer) {
        customers.add(customer);
        System.out.println("Coffee Attendant: '" + customer.getName()
                + ", I've started working on your order of "
                + customer.getDrinkOrdered() + "'");
    }

    public void prepareDrink(String drinkToPrepare) {
        completedDrinks.add(drinkToPrepare);
    }

    public void callOutCompletedOrder() {
        for (String readyDrink : completedDrinks) {
            System.out.println("Order up: " + readyDrink);
            for (Customer customer : customers) {
                customer.orderReady(readyDrink);
            }
        }
    }
}
