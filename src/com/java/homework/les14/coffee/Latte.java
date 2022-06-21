package com.java.homework.les14.coffee;

public class Latte extends Drink {
    public Latte(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("prepare latte");
    }
}
