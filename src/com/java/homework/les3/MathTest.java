package com.java.homework.les3;

import java.util.Scanner;

public class MathTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть чисо a");
        int a = in.nextInt();
        System.out.println("Введіть чисо b");
        int b = in.nextInt();
        System.out.println("Введіть чисо c");
        int c = in.nextInt();
        System.out.println("[a-b]/(a+b)^3-√с = " + (java.lang.Math.abs(a - b) / java.lang.Math.pow((a + b), 3) - java.lang.Math.sqrt(c)));


    }

    }



