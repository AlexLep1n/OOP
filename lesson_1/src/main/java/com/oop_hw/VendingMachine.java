package com.oop_hw;

public interface VendingMachine {

    public abstract Product getProduct(int position, double volume, int temperature);

    public abstract void fullPrice();

    public abstract void getMoney();

    @Override
    public abstract String toString();
}
