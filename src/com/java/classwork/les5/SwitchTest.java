package com.java.classwork.les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введіть чісло");
        int number = Integer.parseInt(in.readLine());
        System.out.println("number " + number);


        switch (number) {
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("okt");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("des");
                break;
            default:
                System.out.println("нет такого мес");
        }


    }
}