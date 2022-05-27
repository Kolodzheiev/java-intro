package com.java.homework.les10;

import com.java.common.ConsoleUtils;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введіть число для визначеня факторіала ");
        int N = ConsoleUtils.getNumber();
        System.out.println(factorial(N));

    }

    public static int factorial(int number) {
        if (number == 1) {
            return number;
        }
        if (number < 0) {
            System.out.println("Не треба тобі факторіал відьємного числа");
            return -1;
        }
        return number * factorial(number - 1);
    }
}
