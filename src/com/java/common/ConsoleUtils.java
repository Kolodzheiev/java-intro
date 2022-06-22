package com.java.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleUtils {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    // Рекурсія
    public static Integer getNumber() {
        try {
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return getNumber();
        }


    }

    //print
    public static void print(int[] array, String message) {
        System.out.println(message + " " + Arrays.toString(array));
    }


    public static void print(String[] array, String message) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    //min max random
    public static void generateNumbersArray(int[] numbers, int min, int max) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random(min, max);

        }
    }


    public static int random(int min, int max) {
        double random = Math.random();
        return (int) ((random * (max - min)) + min);

    }


    public static String inString() {
        try {
            System.out.println("Введіть щось");
            return READER.readLine();
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return inString();
        }
    }


    public static Integer getNumber(int min, int max) {
        try {
            String str = READER.readLine();
            int integer = Integer.parseInt(str);
            if (integer < min || integer > max) {
                System.out.println("Ви ввели число поза діапозоном");
                return getNumber(min, max);
            }
            return integer;
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return getNumber();
        }
    }
    public static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ConsoleUtils.getNumber();
        }
    }
}








