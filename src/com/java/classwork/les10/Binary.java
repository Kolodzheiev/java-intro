package com.java.classwork.les10;

public class Binary {
    public static void main(String[] args) {
        int i = 45;
        System.out.println(Integer.toBinaryString(i));
        //int result = ~i;
       // System.out.println(Integer.toBinaryString(result));
        int and = i & 56;
        System.out.println(Integer.toBinaryString(and));
    }
}
