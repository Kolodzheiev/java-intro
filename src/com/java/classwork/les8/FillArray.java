package com.java.classwork.les8;

import com.java.common.ConsoleUtils;

public class FillArray {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int number = ConsoleUtils.getNumber();


        String[] string = new String[number];
        for (int i = 0; i < string.length; i++) {

             string[i]= ConsoleUtils.inString();

        }
        ConsoleUtils.print(string,"");

    }

}
