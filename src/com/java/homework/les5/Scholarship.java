package com.java.homework.les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введіть оцінку з математікі");
        int mathematics = Integer.parseInt(in.readLine());

        System.out.println("Введіть оцінку з історіі");
        int history = Integer.parseInt(in.readLine());

        System.out.println("Введіть оцінку з біологіі");
        int biology = Integer.parseInt(in.readLine());

        System.out.println("Введіть оцінку з хіміі");
        int chemistry = Integer.parseInt(in.readLine());

        System.out.println("Введіть оцінку з фізики");
        int physics = Integer.parseInt(in.readLine());

        double averageScore = calculateAverageScore(mathematics, history, biology, chemistry, physics);
        System.out.println("Середній бал - " + averageScore);

        if (averageScore >= 10) {
            System.out.println("Підвищена степендія");
        } else if (averageScore < 10 && averageScore >= 8) {
            System.out.println("Звичайна степендія");
        } else if (averageScore < 8) {
            System.out.println("Без степендії");
        }

    }


    public static double calculateAverageScore(int mathematics, double history, int biology, int chemistry, int physics) {
        return (mathematics + history + biology + chemistry + physics) / 5;
    }

}