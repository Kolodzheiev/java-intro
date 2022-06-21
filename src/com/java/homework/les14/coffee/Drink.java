package com.java.homework.les14.coffee;

public class Drink {


    String name;
    double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void prepare() {

        System.out.println("prepare");
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
