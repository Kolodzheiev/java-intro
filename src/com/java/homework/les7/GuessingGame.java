package com.java.homework.les7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Відгадай число від 1 до 10");
        int i = Integer.parseInt(in.readLine());
        double random = Math.random();
        int r = (int) (random * 10);

        while (i != r) {

            if (i < r) {
                System.out.println("Число меньше потрібного");
            } else {
                System.out.println("Число білше потрібного");
            }
            i = Integer.parseInt(in.readLine());
        }
        System.out.println("Вгадав");

    }
}
