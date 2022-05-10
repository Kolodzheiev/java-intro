package com.java.homework.les6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть кількість яблук");
        int apple = Integer.parseInt(in.readLine());

        int numberAppleInLargeCans = 5;
        int numberAppleInMediumCans = 3;
        int numberAppleInSmallCans = 1;

        int largeCans = calculateLargeCans(apple, numberAppleInLargeCans);
        System.out.println("Large cans - " + largeCans);
        int mediumCans = calculateMediumCans(apple, largeCans, numberAppleInLargeCans, numberAppleInMediumCans);
        System.out.println("Medium cans - " + mediumCans);
        System.out.println("Small cans - " + calculateSmallCans(apple, largeCans, mediumCans, numberAppleInLargeCans, numberAppleInMediumCans));

    }

    public static int calculateLargeCans(int apple, int numberAppleInLargeCans) {
        return apple / numberAppleInLargeCans;
    }

    public static int calculateMediumCans(int apple, int largeCans, int numberAppleInLargeCans, int numberAppleInMediumCans) {
        return (apple - largeCans * numberAppleInLargeCans) / numberAppleInMediumCans;
    }

    public static int calculateSmallCans(int apple, int largeCans, int mediumCans, int numberAppleInLargeCans, int numberAppleInMediumCans) {
        return apple - largeCans * numberAppleInLargeCans - mediumCans * numberAppleInMediumCans;
    }


}


