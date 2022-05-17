package com.java.homework.les8;

import com.java.common.ConsoleUtils;

import java.io.IOException;

public class DivideArray {
    public static void main(String[] args) throws IOException {
        int[] array = new int[20];
        int miniArray = array.length / 2;

        fillArray(array);

        int[] firstArray = new int[miniArray];
        int[] secondArray = new int[miniArray];

        divideArray(array, firstArray, secondArray);
        //  divideArrayManual(array, firstArray, secondArray);

        ConsoleUtils.print(firstArray, "Перша половинка");
        ConsoleUtils.print(secondArray, "Друга половинка");
    }
    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ConsoleUtils.getNumber();
        }
        ConsoleUtils.print(array, "Ваш масив");
    }

    private static void divideArrayManual(int[] array, int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = array[i];
        }

        for (int i = secondArray.length; i < array.length; i++) {
            secondArray[i - secondArray.length] = array[i];
        }
    }

    private static void divideArray(int[] array, int[] firstArray, int[] secondArray) {
        System.arraycopy(array, 0, firstArray, 0, firstArray.length);

        if (array.length - secondArray.length >= 0)
            System.arraycopy(array, secondArray.length, secondArray, 0, array.length - secondArray.length);
    }


}
