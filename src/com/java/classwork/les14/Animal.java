package com.java.classwork.les14;

public class Animal {
    static String DEFAULT_COLOR = "white";
    protected String color;



    public Animal(String color){
        this.color = color;
    }


    public void speak(){
        System.out.println("animal speaks");
    }


}
