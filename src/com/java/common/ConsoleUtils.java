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
    public static void generateNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            double random = Math.random();
            int max = 45;
            int min = 18;
            int age = (int) ((random * (max - min)) + min);
            numbers[i] = age;

        }
    }



    public static String inString() {
        try {
            System.out.println("Input string");
            return READER.readLine();
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return inString();
        }
    }
}
