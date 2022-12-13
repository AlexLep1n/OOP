package com.oop_hw;

public class HotDrink extends Product {
    private int temperature;
    private double volume;

    public HotDrink(String name, int quantity, int price, int position, int temperature, double volume) {
        super(name, quantity, price, position);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPosition() {
        return super.getPosition();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + ", Температура: " + temperature;
    }
}
