package com.java.classwork.les8;

public class Kenedi {
    public static void main(String[] args) {
        int[] killers = {3, 5, 2, 8, 6, 1, 9, 7, 4, 0};
        int killer = 0;
        int numberKiller = 0;
        for (int i = 0; i < killers.length; i++) {
            if (killers[i] > killer) {
                killer = killers[i];
                numberKiller=i+1;

            }

        }
        System.out.println(numberKiller);
    }
}
