package com.java.homework.les1;

import java.util.Scanner;

public class VariablesSubstitution {
    public static void main(String[] args) {
        float a, b, temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть число a");
        a = in.nextFloat();
        System.out.println("Введіть число b");
        b = in.nextFloat();
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a + "b=" + b);

    }
}
