package com.java.homework.les10;

import com.java.common.ConsoleUtils;

public class Transpose {
    public static void main(String[] args) {

        System.out.println("Введіть кількість строк масиву");
        int m = ConsoleUtils.getNumber();
        System.out.println("Введіть кількість стовбців масиву");
        int n = ConsoleUtils.getNumber();
        int[][] array = new int[m][n];
        int[][] arrayTranspose = new int[n][m];
        System.out.println("Заповніть масив");

        fillArray(m, n, array);
        System.out.println("Спочатку було так");
        printArray(n, array);

        transposeArray(array, arrayTranspose);
        System.out.println("Стало так");
        printTransposeArray(arrayTranspose);

    }

    private static void printTransposeArray(int[][] arrayTranspose) {
        for (int[] ints : arrayTranspose) {
            for (int anInt : ints) {
                System.out.print("   " + anInt);
            }
            System.out.println();
        }
    }

    private static void transposeArray(int[][] array, int[][] arrayTranspose) {
        for (int i = 0; i < arrayTranspose.length; i++) {
            for (int j = 0; j < arrayTranspose[i].length; j++) {
                arrayTranspose[i][j] = array[j][i];
            }
        }
    }

    public static void printArray(int n, int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < n; j++) {
                System.out.print("   " + ints[j]);
            }
            System.out.println();
        }
    }

    private static void fillArray(int m, int n, int[][] array) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ConsoleUtils.getNumber();
            }
        }
    }
}

