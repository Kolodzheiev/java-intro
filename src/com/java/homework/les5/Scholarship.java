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

        if (!isGradesValid(mathematics, history, biology, chemistry, physics)) {
            return;
        }

        double averageScore = calculateAverageScore(mathematics, history, biology, chemistry, physics);
        System.out.println("Середній бал - " + averageScore);

        printScholarship(averageScore);

    }

    private static boolean isGradesValid(int mathematics, int history, int biology, int chemistry, int physics) {
        if (mathematics < 0 || history < 0 || biology < 0 || chemistry < 0 || physics < 0) {
            System.out.println("Такої оцінки не існує");
            return false;
        } else if (mathematics > 12 || history > 12 || biology > 12 || chemistry > 12 || physics > 12) {
            System.out.println("Є не існуючі оцінки");
            return false;
        }
        return true;
    }


    public static double calculateAverageScore(int mathematics, double history, int biology, int chemistry, int physics) {
        return (mathematics + history + biology + chemistry + physics) / 5;
    }

    public static void printScholarship(double calculateAverageScore) {
        if (calculateAverageScore >= 10) {
            System.out.println("Підвищена степендія");
        } else if (calculateAverageScore < 10 && calculateAverageScore >= 8) {
            System.out.println("Звичайна степендія");
        } else if (calculateAverageScore < 8) {
            System.out.println("Без степендії");
        }

    }


}