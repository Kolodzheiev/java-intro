package com.java.classwork.les9;

import com.java.common.ConsoleUtils;

import java.util.Arrays;

import static com.java.common.ConsoleUtils.getNumber;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int number = getNumber();

        int[] arrayRandom = new int[number];
        int min = 0;
        int max = 9;

        ConsoleUtils.generateNumbersArray(arrayRandom,min, max);
        System.out.println(Arrays.toString(arrayRandom));



    }
}

