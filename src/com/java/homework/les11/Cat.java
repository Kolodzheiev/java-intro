package com.java.homework.les11;

public class Cat {
    String name;
    String breed;
    int age;
    int weight;

    public Cat(){
    }

    public Cat(int age,int weight){
        this.age = age;
        this.weight = weight;

    }

    public Cat(String name, String breed, int age, int weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat cat) {
            return this.age == cat.age && this.weight == cat.weight;

        }
        return false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
