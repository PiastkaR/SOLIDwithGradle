package com.pattern.observer.coffeeshop.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Getter
@Setter
@Slf4j
public class Customer implements com.pattern.observer.coffeeshop.observers.Customer {
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void orderReady(String preparedDrink) {
        log.info("Customer notified.");
        log.info("Prepared drink: " + preparedDrink);
    }

    private void exitStore() {
        System.out.println(name + ": Thank you, I've received my "
                + drinkOrdered + " and leaving the store now...");
    }
}
