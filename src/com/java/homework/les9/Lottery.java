package com.java.homework.les9;

import com.java.common.ConsoleUtils;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("Введіть кількість чисел");
        int number = ConsoleUtils.getNumber();

        int[] arrayRandom = new int[number];
        int min = 0;
        int max = 9;

        ConsoleUtils.generateNumbersArray(arrayRandom, min, max);
        System.out.println("Введіть " + number + " числа від " + min + " до " + max);

        int[] inputNumber = new int[number];
        ConsoleUtils.generateNumbersArray(arrayRandom, min, max);

        Arrays.sort(arrayRandom);
        Arrays.sort(inputNumber);
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println(Arrays.toString(inputNumber));

        int coincidence = getCoincidence(arrayRandom, inputNumber);
        System.out.println("Кількість збігів " + coincidence);
    }

    private static int getCoincidence(int[] arrayRandom, int[] inputNumber) {
        int coincidence = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] == inputNumber[i]) {
                coincidence++;
            }
        }
        return coincidence;
    }
}