package com.java.classwork.les9;

import com.java.common.ConsoleUtils;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int number = ConsoleUtils.getNumber();

        int[] arrayRandom = new int[number];
        int min = 0;
        int max = 9;

        ConsoleUtils.generateNumbersArray(arrayRandom,min, max);
        System.out.println(Arrays.toString(arrayRandom));



    }
}

