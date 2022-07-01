package com.java.homework.les16;

public class Genre {

    private static int ID_GENERATOR;
    int id;
    private final String name;
    private final String description;

    public Genre(String name, String description) {
        this.id = ++ID_GENERATOR;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
