package com.java.homework.les14.coffee;

public class Coffee extends Drink {
    boolean milk;

    public Coffee(String name, double price, boolean milk) {
        super(name, price);
        this.milk = milk;
    }

    @Override
    public void prepare() {
        String milkMassage = getMilkMassage();
        System.out.println(name + milkMassage + " готується");
    }

    private String getMilkMassage() {
        return milk ? " з молококм" : " без молока";
    }

    @Override
    public String toString() {
        return name + getMilkMassage() + ", ціна = " + price;
    }
}
