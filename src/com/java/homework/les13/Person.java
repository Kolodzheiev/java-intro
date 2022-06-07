package com.java.homework.les13;

public class Person {
    String name;
    String lastname;
    int age;
    int height;
    int weight;

    public Person() {

        this.name = arrayName[(int) (Math.random() * arrayName.length)];
        this.lastname = arrayLastname[(int) (Math.random() * arrayLastname.length)];
        this.age = generateAges();
        this.height = generateHeight();
        this.weight = generateWeight();
    }

    private static final String[] arrayName = {"Sveta", "Tanya", "Petro", "Mariana", "Oleg", "Timur", "Lena", "Sergey", "Liana", "Kolya", "Den"};
    private static final String[] arrayLastname = {"Petrov(a)", "Ivanov(a)", "Sidorov(a)", "Dubrov(a)", "Smirnoff(a)", "Davidov(a)", "Sumskii", "Te", "Uebov(a)"};

    private static int generateAges() {
        double random = Math.random();
        int max = 18;
        int min = 65;
        return (int) ((random * (max - min)) + min);
    }

    private static int generateHeight() {
        double random = Math.random();
        int max = 150;
        int min = 210;
        return (int) ((random * (max - min)) + min);
    }

    private static int generateWeight() {
        double random = Math.random();
        int max = 50;
        int min = 160;
        return (int) ((random * (max - min)) + min);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
