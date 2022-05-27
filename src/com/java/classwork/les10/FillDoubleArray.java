package com.java.classwork.les10;

import com.java.common.ConsoleUtils;

import java.util.Arrays;

public class FillDoubleArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int arr = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j){
                    array[i][j] = arr;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
