package com.java.homework.alg;

import com.java.common.ConsoleUtils;

import java.io.IOException;

public class Sum {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 4, 45, 6, 10, 8};
        System.out.println("Введіть сумму");
        int sum = Integer.parseInt(ConsoleUtils.READER.readLine());
        searchAmount(arr, sum);

    }

    private static void searchAmount(int[] arr, int sum) {
        for (int i = 0; i < arr.length; ++i) {
            int rest = sum - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == rest) {
                    System.out.println("Сума " + sum + " це (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}



