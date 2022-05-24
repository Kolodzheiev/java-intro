package com.java.classwork.les8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array {
    static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int[] numbers = new int[5];
        int num = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " index " + numbers[i]);
        }
    }
}
