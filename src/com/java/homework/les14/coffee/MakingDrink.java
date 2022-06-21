package com.java.homework.les14.coffee;

import com.java.common.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;


public class MakingDrink {


    private static final int PRICE_BLACK_TEA = 10;
    private static final int PRICE_GREEN_TEA = 10;
    private static final int PRICE_COFFEE_WITH_MILK = 20;
    private static final int PRICE_COFFEE_WITHOUT_MILK = 15;
    private static final int PRICE_LATTE = 20;
    private static final int PRICE_CAPPUCCINO = 20;

    public static void main(String[] args) {

        List<Drink> drinks = new ArrayList<>();
        System.out.println("Для виходу введіть exit, для продовженя будь яку клавішу");
        while (!(ConsoleUtils.inString().equalsIgnoreCase("exit"))) {
            Drink drink = createDrink();
            drinks.add(drink);
            drink.prepare();

            System.out.println("Щє щось?");
            System.out.println("Для виходу введіть exit, для продовженя будь яку клавішу");
        }

        double price = 0;
        for (Drink drink : drinks) {
            price += drink.getPrice();
            System.out.println(drink);
        }
        System.out.println("До сплати " + price);
    }

    private static Drink createDrink() {

        Drink drinks = null;
        int drinkType = getDrink();
        switch (drinkType) {
            case 1 -> drinks = new Tea("Black tea", PRICE_BLACK_TEA);
            case 2 -> drinks = new Tea("Green tea", PRICE_GREEN_TEA);
            case 3 -> drinks = new Coffee("Coffee with milk", PRICE_COFFEE_WITH_MILK);
            case 4 -> drinks = new Coffee("Coffee without milk", PRICE_COFFEE_WITHOUT_MILK);
            case 5 -> drinks = new Latte("Latte", PRICE_LATTE);
            case 6 -> drinks = new Cappuccino("Cappuccino", PRICE_CAPPUCCINO);
        }
        return drinks;
    }

    private static int getDrink() {
        System.out.println("Виберіть напій який потрібно приготувати");
        System.out.println("1 - Чорний чай");
        System.out.println("2 - Зелений чай");
        System.out.println("3 - Кава з молоком");
        System.out.println("4 - Кава");
        System.out.println("5 - Лате");
        System.out.println("6 - Капучіно");

        return ConsoleUtils.getNumber();
    }
}

