package com.java.homework.les14.coffee;

public class Coffee extends Drink {
    public Coffee(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("prepare coffee");
    }
}
