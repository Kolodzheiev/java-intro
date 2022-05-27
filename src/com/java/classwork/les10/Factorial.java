package com.java.classwork.les10;

import com.java.common.ConsoleUtils;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        int N = ConsoleUtils.getNumber();
        System.out.println(factorial(N));

    }

    public static int factorial(int number) {
        if(number==1){
            return number;
        }
        return number*factorial(number-1);



    }
}
