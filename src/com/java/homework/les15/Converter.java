package com.java.homework.les15;

import com.java.common.ConsoleUtils;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Для продовження натисніть любу клавішу");
        System.out.println("Для виходу введіть 'EXiT'");

        while (!(ConsoleUtils.inString().equalsIgnoreCase("exit"))) {

            System.out.println("Введіть температуру в цельсіях");
            double temperatureC = ConsoleUtils.getNumber();

            System.out.println("Виберіть в яку шкалу будемо конвертувати");
            System.out.println("Нтисніть 'F' для форенгейтів чи 'K' для кельвінів");
            String temperatureScale = inputTemperatureScale();
            Convertable converter = createConverterTemperature(temperatureScale);
            converter.convert(temperatureC);
            System.out.println(converter.convert(temperatureC));
            System.out.println("Для продовження натисніть любу клавішу");
            System.out.println("Для виходу введіть 'EXiT'");
        }
    }

    private static Convertable createConverterTemperature(String temperatureScale) {
        Convertable converterTemperature;
        if(temperatureScale.equalsIgnoreCase("F")){
            converterTemperature = new ConvertF();

        } else {
            converterTemperature = new ConvertK();

        }
        return converterTemperature;
    }

    private static String inputTemperatureScale() {
        String temperatureScale = ConsoleUtils.inString();
        if ((temperatureScale.equalsIgnoreCase("F"))
                || ((temperatureScale.equalsIgnoreCase("K")))){
            return temperatureScale;
        }
        return inputTemperatureScale();
    }

}
