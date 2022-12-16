package com.oop_hw;

import java.util.List;

public class HotDrinksVMachine implements VendingMachine {
    List<HotDrink> hotDrinks;

    public HotDrinksVMachine(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public HotDrink getProduct(int position, double volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (position == hotDrink.getPosition() && volume == hotDrink.getVolume()
                    && temperature == hotDrink.getTemperature()) {
                return hotDrink;
            }
        }
        throw new IllegalStateException("Такого товара нет!");
    }

    @Override
    public void fullPrice() {

    }

    @Override
    public void getMoney() {

    }

    @Override
    public String toString() {
        return ("Название напитков: " + hotDrinks).replace('[', ' ').replace(']', ' ');
    }

}
