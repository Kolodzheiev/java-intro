package com.java.homework.les13;

import com.java.common.ConsoleUtils;

public class PersonObject {
    public static void main(String[] args) {
        System.out.println("Введіть кількість людей");
        int count = ConsoleUtils.getNumber();
        generatePerson(count);
    }

    private static void generatePerson(int count) {
        Person[] persons = new Person[count];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
            System.out.println(i + 1 + "  " + persons[i]);
        }
        System.out.println();
    }


}
