package com.java.homework.les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть довжину валізи");
        int length = Integer.parseInt(in.readLine());

        System.out.println("Введіть висоту валізи");
        int height = Integer.parseInt(in.readLine());

        System.out.println("Введіть ширину валізи");
        int width = Integer.parseInt(in.readLine());

        if (length <= 55 && height <= 40 && width <= 20){
            System.out.println("Багаж проходить");

        } else if (length <= 40 && height <= 53 && width <= 22) {
            System.out.println("Багаж проходить");
        }else System.out.println("Бфгфж не проходить");
    }
}
