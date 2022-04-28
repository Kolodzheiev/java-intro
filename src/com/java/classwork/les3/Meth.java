package com.java.classwork.les3;

import java.util.Scanner;

public class Meth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть чисо a");
        int a = in.nextInt();
        System.out.println("Введіть чисо b");
        int b = in.nextInt();
        System.out.println("Введіть чисо c");
        int c = in.nextInt();
        System.out.println("[a-b]/(a+b)^3-√с = " + (Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c)));


    }
}

