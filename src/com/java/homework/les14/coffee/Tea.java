package com.java.homework.les14.coffee;

public class Tea extends Drink{
        public Tea(String name, double price) {
            super(name, price);
        }

        @Override
        public void prepare() {
            System.out.println("prepare tea");
        }
}
