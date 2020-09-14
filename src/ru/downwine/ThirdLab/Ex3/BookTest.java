package ru.downwine.ThirdLab.Ex3;
import java.util.Scanner;
public class BookTest {
    public static void main(String[] args) {
        System.out.println("Введите автора книги, название, год написания, количество страниц: ");
        Scanner in = new Scanner(System.in);
        String a, b;
        int c, d;
        a = in.next();
        b = in.next();
        c = in.nextInt();
        d = in.nextInt();
        Book book = new Book(a,b,c,d);
        System.out.println(book);
    }
}
