package com.java.classwork.les10;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                System.out.print("(" + i + "," + j + "); has value " + arr[i][j] + ":");

            }
            System.out.println();

        }
    }

}
