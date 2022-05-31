package com.java.homework.les10;

import com.java.common.ConsoleUtils;

public class NegativeNumbers {
    public static void main(String[] args) {
        int min = -100;
        int max = 100;

        System.out.println("Введіть кількість строк масиву");
        int m = ConsoleUtils.getNumber();
        System.out.println("Введіть кількість стовбців масиву");
        int n = ConsoleUtils.getNumber();
        int[][] array = fillArrayRandom(min, max, m, n);



        System.out.println("----------------------");
        System.out.println("Рандомний масив");
        System.out.println("----------------------");

        outputRandomArray(array);

        System.out.println("----------------------");
        System.out.println("Відьєьні числа масіву");
        System.out.println("----------------------");

        outputNegativeNumber(array);
    }
    private static void outputNegativeNumber(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("Індекси [" + i + "," + "" + j + "] = " + array[i][j]);
                }
            }
        }
    }
    private static void outputRandomArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("   " + ints[j]);
            }
            System.out.println();
        }
    }
    public static int[][] fillArrayRandom(int min, int max, int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ConsoleUtils.random(min, max);
            }
        }
        return array;
    }
}
