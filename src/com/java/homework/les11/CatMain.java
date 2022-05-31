package com.java.homework.les11;

import com.java.common.ConsoleUtils;

import java.io.IOException;

public class CatMain {
    public static void main(String[] args)throws IOException {

        System.out.println("Введіть ім'я котіка");
        String name = ConsoleUtils.READER.readLine();
        System.out.println("Введіть породу котіка");
        String breed = ConsoleUtils.READER.readLine();
        System.out.println("Введіть вік котіка");
        int age = ConsoleUtils.getNumber();
        System.out.println("Введіть вагу котіка");
        int weight = ConsoleUtils.getNumber();

        System.out.println("Введіть ім'я другого котіка");
        String nameCat = ConsoleUtils.READER.readLine();
        System.out.println("Введіть породу другого котіка");
        String breedCat = ConsoleUtils.READER.readLine();
        System.out.println("Введіть вік другого котіка");
        int ageCat = ConsoleUtils.getNumber();
        System.out.println("Введіть вагу другого котіка");
        int weightCat = ConsoleUtils.getNumber();

        Cat cat = new Cat(name,breed,age,weight);
        System.out.println(cat);

        Cat cat1 = new Cat(nameCat,breedCat,ageCat,weightCat);

        Cat cat2 = new Cat(ageCat,weightCat);
        System.out.println(cat2);
        boolean equals = cat.equals(cat1);
        String message = equals ? "Однакові":"Не однакові";
        System.out.println(message);

    }
}
