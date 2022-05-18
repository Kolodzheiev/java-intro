package com.java.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleUtils {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static Integer getNumber() {
        try {
            System.out.println("Input number");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error " + exception.getMessage());
            return getNumber();
        }



    }


    public static void print(int[] array, String message) {
        System.out.println(message + " " + Arrays.toString(array));
    }

}
