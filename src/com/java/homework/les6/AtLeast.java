package com.java.homework.les6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtLeast {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Input b");
        int b = Integer.parseInt(in.readLine());
        System.out.println("Input c");
        int c = Integer.parseInt(in.readLine());

        int min = min(a, b, c);
        System.out.println("min = " + min);

    }

    public static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }
}
