package com.java.homework.les14.taxes;

import com.java.common.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

    public static void main(String[] args) {
        List<Property> propertyTaxes = new ArrayList<>();
        System.out.println("Для виходу введіть exit, для продовженя будь яку клавішу");
        while (!(ConsoleUtils.inString().equalsIgnoreCase("exit"))) {
            Property property = createProperty();
            propertyTaxes.add(property);

            System.out.println("Ваш податок = " + property.calculateTax());
            System.out.println("Продовжити?");
            System.out.println("Для виходу введіть exit, для продовженя будь яку клавішу");
        }
        for (Property tax : propertyTaxes) {
            System.out.println(tax);
        }
    }

    private static Property createProperty() {

        int subsidy = 0;
        int proceeds = 0;
        int propertyType = getPropertiesType();

        System.out.println("Введіть площу нерухомості");
        int square = ConsoleUtils.getNumber();
        System.out.println("Введіть податок на 1м^2");
        double taxPerSquareMeter = ConsoleUtils.getNumber();
        if (propertyType == 1) {
            System.out.println("Введіть розмір субсидіі в %");
            subsidy = ConsoleUtils.getNumber();
        } else if (propertyType == 2) {
            System.out.println("Введіть розмір виручкки");
            proceeds = ConsoleUtils.getNumber();
        }
        Property property = null;
        switch (propertyType) {
            case 1 -> property = new ResidentialProperties(square, taxPerSquareMeter, subsidy);
            case 2 -> property = new CommercialRealEstate(square, taxPerSquareMeter, proceeds);
            case 3 -> property = new IndustrialRealEstate(square, taxPerSquareMeter);
        }
        return property;
    }

    private static int getPropertiesType() {
        System.out.println("Виберіть об'єкт нерухомості на який потрібно розрахувати податок");
        System.out.println("1 - Житлова нерухомість");
        System.out.println("2 - Торгова нерухомість");
        System.out.println("3 - Виробнича нерухомість");

        return ConsoleUtils.getNumber();
    }
}
