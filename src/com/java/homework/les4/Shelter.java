package com.java.homework.les4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shelter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number of dogs");
        int dog = Integer.parseInt(in.readLine());
        System.out.println("number of cats ");
        int cat = Integer.parseInt(in.readLine());
        System.out.println("number of meals ");
        int numberMeals = Integer.parseInt(in.readLine());
        System.out.println("number of days in a month ");
        int day = Integer.parseInt(in.readLine());
        System.out.println("weight of one serving of food in grams ");
        int foodWeight = Integer.parseInt(in.readLine());
        System.out.println("price of one meal ");
        int priceOneMeal = Integer.parseInt(in.readLine());

        double catEat = calculateHowMuchEat(cat, numberMeals, day, foodWeight);
        System.out.println("За " + day + " день коти з'їдять - " + catEat + " кг.");

        double dogEat = calculateHowMuchEat(dog, numberMeals, day, foodWeight);
        System.out.println("За " + day + " день собаки з'їдять - " + dogEat + " кг.");

        int price = calculateShelterExpenses(cat, dog, numberMeals, priceOneMeal);
        System.out.println("На утримання приюту потрібно - " + price + " $");

    }

    public static int calculateShelterExpenses(int cat, int dog, int numberMeals, int priceOneMeal) {
        return (cat + dog) * numberMeals * priceOneMeal;
    }

    public static double calculateHowMuchEat(int numberOfAnimals, int numberMeals, int day, int foodWeight) {
        return (double) (numberOfAnimals * numberMeals * day * foodWeight) / 1000;
    }

}
