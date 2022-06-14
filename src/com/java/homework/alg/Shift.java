package com.java.homework.alg;

import com.java.common.ConsoleUtils;

import java.io.IOException;
import java.util.Arrays;

public class Shift {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(array));
        int n = Integer.parseInt(ConsoleUtils.READER.readLine());
        /*for (int i = 0; i < n; i++) {
            int tmp = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j + 1];
            array[array.length - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));*/

//      Зсув в ліво
        /*int length = array.length;
        int[] arrayShift = new int[length];
        System.arraycopy(array, n, arrayShift, 0, length - n);
        System.arraycopy(array, 0, arrayShift, length - n, n);
        System.out.println(Arrays.toString(arrayShift));*/

//      Зсув в право
        int length = array.length;
        int[] arrayShift = new int[length];
        System.arraycopy(array, 0, arrayShift, length - n,  n);
        System.arraycopy(array, n, arrayShift, 0, length - n);

        System.out.println(Arrays.toString(arrayShift));


    }

}




