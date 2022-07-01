package com.java.homework.les16;

public class Author {
    private static int ID_GENERATOR;

    private final int id;
    private final String name;
    private final String lastname;

    public Author(String name, String lastname) {
        this.id = ++ID_GENERATOR;
        this.name = name;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
