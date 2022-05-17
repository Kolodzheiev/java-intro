package com.java.homework.les8;

import java.util.Arrays;

public class SoccerPlayers {
    public static void main(String[] args) {
        int teamSize = 11;
        int[] players1 = new int[teamSize];
        int[] players2 = new int[teamSize];

        generateAges(players1);
        System.out.println("Вік гравців першої ккоманди" + Arrays.toString(players1));
        generateAges(players2);
        System.out.println("Вік гравців другої ккоманди" + Arrays.toString(players2));

        float averageAge1 = calculateAverageAge(players1);
        System.out.println("Середрій вік гравців першої команди " + averageAge1);

        float averageAge2 = calculateAverageAge(players2);
        System.out.println("Середрій вік гравців другої команди " + averageAge2);

        compareAverageAge(averageAge1, averageAge2);

    }

    private static void generateAges(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            double random = Math.random();
            int max = 45;
            int min = 18;
            int age = (int) ((random * (max - min)) + min);
            numbers[i] = age;

        }
    }

    private static int calculateAverageAge(int[] players) {
        int sum = 0;
        for (int j : players) {
            sum = (sum + j);
        }
        return sum / players.length;
    }

    private static void compareAverageAge(float averageAge1, float averageAge2) {
        if (averageAge1 < averageAge2) {
            System.out.println("Перша команда молодша");
        } else if (averageAge1 > averageAge2) {
            System.out.println("Друга команда молодша");
        } else {
            System.out.println("Команди однакові");
        }
    }

}