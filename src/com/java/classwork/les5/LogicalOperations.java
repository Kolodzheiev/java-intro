package com.java.classwork.les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogicalOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введіть чісло");
        int number = Integer.parseInt(in.readLine());
        System.out.println("number " + number);
        if (number > 0) {
            System.out.println("yor number >0");
        } else {
            System.out.println("yor number <0");
        }

    }
}
