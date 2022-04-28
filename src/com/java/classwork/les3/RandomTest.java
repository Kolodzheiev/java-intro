package com.java.classwork.les3;

public class RandomTest {
    public static void main(String[] args) {
        double random = Math.random();
        int r = (int) (-50 + random * 100);
        System.out.println(r);
        int max = 100;
        int min = -100;
        int a = (int)((random * (max - min)) + min);
        System.out.println(a);


    }
}
