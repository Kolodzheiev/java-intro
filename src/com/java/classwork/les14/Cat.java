package com.java.classwork.les14;

public class Cat extends Animal{

    String breed;
    public  Cat(String color,String breed){
        super(color);
        this.breed = breed;
    }
    @Override
    public void speak() {
        super.speak();
        System.out.println("mau");
    }
}
