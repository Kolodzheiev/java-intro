package com.java.classwork.les14;

public class Dog extends Animal{
    public  Dog(){
        super("black");
    }
    public void speak(){
        System.out.println("gav");
        action();

    }
    private void action(){
        System.out.println("виляет хвостом");
    }


}
