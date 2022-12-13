package com.oop_hw;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProductByPos(int position) {
        for (Product product : products) {
            if (position == product.getPosition()) {
                return product;
            }
        }
        throw new IllegalStateException("Такого товара нет!");
    }

    public void fullPrice() {

    }

    public void getMoney() {

    }

    public void giveProduct() {

    }

    @Override
    public String toString() {
        return "Список продуктов: " + products;
    }
}
