package com.java.homework.les14;

import com.java.common.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

    public static void main(String[] args) {
        List<PropertyTax> propertyTaxes = new ArrayList<>();

        PropertyTax property = createProperty();
        propertyTaxes.add(property);
        System.out.println("Ваш податок = " + property.calculateTax());

    }
    private static PropertyTax createProperty() {

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
        PropertyTax property = null;
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
        int property = ConsoleUtils.getNumber();

        return property;
    }
}
