package com.java.homework.les3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathTest {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть число a");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Введіть число b");
        int b = Integer.parseInt(in.readLine());
        System.out.println("Введіть число c");
        int c = Integer.parseInt(in.readLine());
        double result = (java.lang.Math.abs(a - b) / java.lang.Math.pow((a + b), 3) - java.lang.Math.sqrt(c));
        System.out.println("|a-b|/(a+b)^3-√с = " + result);


    }

}



