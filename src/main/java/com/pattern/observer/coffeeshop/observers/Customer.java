package com.pattern.observer.coffeeshop.observers;

public interface Customer {
    void orderReady(String preparedDrink);

    String getName();

    String getDrinkOrdered();
}
