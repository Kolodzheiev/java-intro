package com.java.homework.les16;

public class Book {

    private static int ID_GENERATOR;

    private final int id;
    private final String name;
    private final String description;
    private final Genre genre;
    private final Author author;
    private final int yearIssue;

    public Book(String name, String description, Genre genre, Author author, int yearIssue) {
        this.id = ++ID_GENERATOR;
        this.name = name;
        this.description = description;
        this.genre = genre;
        this.author = author;
        this.yearIssue = yearIssue;
    }

    public Author getAuthor() {
        return author;
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

    public Genre getGenre() {
        return genre;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    @Override
    public String toString() {
        return "Book " +
                ", id = " + id +
                ", name = " + name + '\'' +
                ", description = " + description + '\'' +
                ", genre= " + genre +
                ", author = " + author +
                ", yearIssue = " + yearIssue;

    }
}
