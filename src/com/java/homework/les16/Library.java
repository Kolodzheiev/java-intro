package com.java.homework.les16;

import com.java.common.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Author> AUTHORS = new ArrayList<>();
    public static List<Genre> GENRES = new ArrayList<>();
    public static List<Book> BOOKS = new ArrayList<>();


    public static void main(String[] args) {

        MenuItem menuItem;
        Action action;
        while ((menuItem = getMenuItem()) != MenuItem.EXIT) {
            System.out.println("Ви обрали " + menuItem);
            while ((action = getAction()) != Action.EXIT) {
                System.out.println("Ви обрали " + action);
                doAction(action, menuItem);
            }
        }
    }

    private static void doAction(Action type, MenuItem menuItem) {
        switch (type) {
            case ADD -> create(menuItem);
            case DELETE -> delete(menuItem);
            case LIST -> list(menuItem);
        }
    }

    private static void list(MenuItem menuItem) {
        switch (menuItem) {
            case BOOK -> listBooks();
            case GENRE -> listGenres();
            case AUTHOR -> listAuthors();
        }
    }

    private static void listAuthors() {
        for (Author author : AUTHORS) {
            System.out.println(author);
        }
    }

    private static void listGenres() {
        for (Genre genre : GENRES) {
            System.out.println(genre);
        }
    }

    private static void listBooks() {
        for (Book book : BOOKS) {
            System.out.println(book);
        }
    }

    private static void delete(MenuItem menuItem) {

        switch (menuItem) {
            case BOOK -> deleteBook();
            case GENRE -> deleteGenre();
            case AUTHOR -> deleteAuthor();
        }
    }

    private static void deleteAuthor() {
        listAuthors();
        System.out.println("Оберіть id автора якого видаляємо");
        int authorId = ConsoleUtils.getNumber(0, Integer.MAX_VALUE);
        Author author = findAuthor(authorId);
        if(author == null){
            System.out.println("Таккого автора немає!");
            return;
        }
        AUTHORS.remove(author);
        System.out.println("Автора видалено");
        listAuthors();
    }

    private static void deleteGenre() {
        listGenres();
        System.out.println("Оберіть id жану який видаляємо");
        int genreId = ConsoleUtils.getNumber(0, Integer.MAX_VALUE);
        Genre genre = findGenre(genreId);
        if(genre == null){
            System.out.println("Таккого жанру немає!");
            return;
        }
        GENRES.remove(genre);
        System.out.println("Жанр видалено");
        listGenres();
    }

    private static void deleteBook() {
        listBooks();
        System.out.println("Оберіть id книги яку видаляємо");
        int bookId = ConsoleUtils.getNumber(0, Integer.MAX_VALUE);
        Book book = findBook(bookId);
        if(book == null){
            System.out.println("Таккої книги немає!");
            return;
        }
        BOOKS.remove(book);
        System.out.println("Книгу видалено");
        listBooks();
    }

    private static void create(MenuItem menuItem) {
        switch (menuItem) {
            case BOOK -> createBook();
            case GENRE -> createGenre();
            case AUTHOR -> createAuthor();
        }
    }

    private static void createAuthor() {
        System.out.println("Введіть ім'я автора");
        String name = ConsoleUtils.inString();
        System.out.println("Введіть прізвище автора");
        String lastname = ConsoleUtils.inString();

        Author author = new Author(name, lastname);

        AUTHORS.add(author);
    }

    private static void createGenre() {
        System.out.println("Введіть назву жанру");
        String name = ConsoleUtils.inString();
        System.out.println("Введіть опис жанру");
        String description = ConsoleUtils.inString();

        Genre genre = new Genre(name, description);

        GENRES.add(genre);

    }

    private static void createBook() {
        System.out.println("Введіть назву книги");
        String name = ConsoleUtils.inString();
        System.out.println("Введіть опис книги");
        String description = ConsoleUtils.inString();
        System.out.println("Введіть рік випуску");
        int year = ConsoleUtils.getNumber(1000,2022);

        while (GENRES.size()==0){
            System.out.println("Жанрів ще немає, створіть жанр");
            createGenre();
        }
        System.out.println("Оберіть ідентифікатор жанру");
        listGenres();
        int genreId = ConsoleUtils.getNumber(0, Integer.MAX_VALUE);
        Genre genre = findGenre(genreId);
        if(genre == null){
            System.out.println("Таккого жанру немає!");
            return;
        }

        while (AUTHORS.size()==0){
            System.out.println("Авторів ще немає, створіть автора");
            createAuthor();
        }

        System.out.println("Оберіть ідентифікатор автора");
        listAuthors();
        int authorId = ConsoleUtils.getNumber(0, Integer.MAX_VALUE);
        Author author = findAuthor(authorId);
        if(author == null){
            System.out.println("Таккого автора немає!");
            return;
        }

        Book book = new Book(name, description,genre,author,year);
        BOOKS.add(book);
    }

    private static Author findAuthor(int authorId) {
        for (Author author : AUTHORS) {
            if(author.getId() == authorId){
                return author;
            }
        }
        return null;
    }

    private static Genre findGenre(int genreId) {
        for (Genre genre : GENRES) {
            if(genre.getId() == genreId){
                return genre;
            }
        }
        return null;
    }

    private static Book findBook(int bookId) {
        for (Book book : BOOKS) {
            if(book.getId() == bookId){
                return book;
            }
        }
        return null;
    }

    private static MenuItem getMenuItem() {

        System.out.println("Оберіть з чим будемо працювати ");
        for (MenuItem menuItem : MenuItem.values()) {
            System.out.println(menuItem);
        }
        try {
            return MenuItem.valueOf(ConsoleUtils.inString().toUpperCase());
        } catch (Exception e) {
            System.out.println("Не коректно, спробуй ще!");
            return getMenuItem();
        }
    }

    private static Action getAction() {

        System.out.println("Оберіть дію ");
        for (Action action : Action.values()) {
            System.out.println(action);
        }
        try {
            return Action.valueOf(ConsoleUtils.inString().toUpperCase());
        } catch (Exception e) {
            System.out.println("Не коректно, спробуй ще!");
            return getAction();
        }
    }
}
