package com.java.classwork.les13;

class PersonTest {
    private final int age;
    private final String name;

    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person name = " + name + "  person age = " + age;
    }

    public String getName() {
        return name;
    }

}
