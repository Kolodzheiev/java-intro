package com.java.homework.les6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи первое число");
        int num1 = Integer.parseInt(in.readLine());
        System.out.println("Что делать?");
        char operation = in.readLine().charAt(0);
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(in.readLine());
        if (num2 == 0 && operation == '/'){
            System.out.println("На 0 делить нельзя");
            return;
        }


        int result = calc(num1, num2, operation);
        System.out.println("Результат операции: " + result);

    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;

        }
        return result;

    }

}
