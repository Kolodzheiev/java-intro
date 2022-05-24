package com.java.homework.les9;

import com.java.common.ConsoleUtils;

public class Zero {
    public static void main(String[] args) {

        System.out.println("Введіть размір масива");
        int number = ConsoleUtils.getNumber();
        System.out.println("Заповніть масив");

        int[] integer = new int[number];
        for (int i = 0; i < integer.length; i++) {

            integer[i] = ConsoleUtils.getNumber();
        }
        //              Arrays.sort(string);
        extracted(integer);
        ConsoleUtils.print(integer, "");
    }

    private static void extracted(int[] integer) {
        int temp = 0;
        for (int i = 0; i < integer.length; i++) {
            for (int j = 0; j < integer.length; j++) {
                if (integer[i] < integer[j]) {
                    temp = integer[i];
                    integer[i] = integer[j];
                    integer[j] = temp;
                }
            }

        }
    }


}
