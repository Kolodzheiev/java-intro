package com.java.classwork.les4;

import java.util.Scanner;

public class Box {
    // расчитать обьум коробки width, haight, depth
    public static void main(String[] args) {

       int width, haight, depth;
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть width, haight, depth ");
        width= in.nextInt();
        haight= in.nextInt();
        depth= in.nextInt();
        int volume=calculateVolume(width,haight,depth);
        System.out.println(volume);



    }

    public static int calculateVolume(int width, int haight, int depth) {
        return width* haight* depth;

    }
}
