package com.oop_hw;

public class Product {
    private String name;
    private int quantity;
    private int price;
    private int position;

    public Product(String name, int quantity, int price, int position) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Название: " + name + ", Кол-во: " + quantity + ", Цена: " + price + ", Позиция: " + position;
    }
}
