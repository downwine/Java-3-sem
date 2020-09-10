package ru.downwine.SecondLab.Ex3;

import ru.downwine.SecondLab.Ex2.Ball;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите цвет книги, автора книги, название книги, " +
                "количество страниц, высоту книги, ширину книги");
        Scanner in = new Scanner(System.in);
        String bookColor = in.next(), bookAuthor = in.next(), bookTitle = in.next();
        int bookPages = in.nextInt(), bookHeight = in.nextInt(), bookWidth = in.nextInt();
        Book book = new Book(bookAuthor, bookColor, bookTitle, bookWidth, bookHeight, bookPages);
        System.out.println(book);
        System.out.println("Введите нового автора: ");
        bookAuthor = in.next();
        book.setAuthor(bookAuthor);
        System.out.println("Введите новое название: ");
        bookTitle = in.next();
        book.setTitle(bookTitle);
        System.out.println(book);
    }
}
