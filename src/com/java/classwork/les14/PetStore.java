package com.java.classwork.les14;

import java.util.ArrayList;
import java.util.List;

import static com.java.classwork.les14.Animal.DEFAULT_COLOR;

public class PetStore {
    public static void main(String[] args) {
        Animal cat = new Cat(DEFAULT_COLOR,"seam");
        //cat.speak();
        Animal dog = new Dog();
        //dog.speak();
        Animal cat2 = new Cat("black","no name");

        List<Animal>animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("black"));
        for (Animal animal:animals) {
            animal.speak();
            
        }

    }
}
