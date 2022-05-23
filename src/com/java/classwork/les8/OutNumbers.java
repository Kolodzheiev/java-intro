package com.java.classwork.les8;

public class OutNumbers {
    public static void main(String[] args) {
        int[] numbers = {2,5,3,4,3};
        for (int i = 0; i < numbers.length; i++) {
            if (i== numbers.length-1){
                System.out.println(numbers[i]);

            }
            else System.out.print(numbers[i]+",");

        }


    }
}
