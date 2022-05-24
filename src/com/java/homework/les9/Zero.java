package com.java.homework.les9;

import com.java.common.ConsoleUtils;

public class Zero {
    public static void main(String[] args) {

        System.out.println("Введіть размір масива");
        int size = ConsoleUtils.getNumber();
        System.out.println("Заповніть масив");

        int[] numbers = new int[size];
        ConsoleUtils.fillArray(numbers);
        // Arrays.sort(string);
        sort(numbers);
        ConsoleUtils.print(numbers, "");
    }



    private static void sort(int[] integer) {
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
