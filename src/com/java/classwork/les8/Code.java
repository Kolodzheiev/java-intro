package com.java.classwork.les8;

public class Code {
    public static void main(String[] args) {
        int code = 7648;
        int number1 = (code / 1000) % 10;
        int number2 = (code / 100) % 10;
        int number3 = (code / 10) % 10;
        int number4 = code % 10;
        System.out.println(number1 + "" + number2 + "" + number3 + "" + number4);
        int[] arrayCode = {number1, number2, number3, number4};
        int index = 0;
        for (int k : arrayCode) {

            for (int j = 0; j < 10; j++) {
                index++;
                if (k == j) {

                    System.out.println("Угадали код" + j);

                    break;
                }

            }

        }
        System.out.println(index);


    }
}
