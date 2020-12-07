package ru.downwine._24_TwentyfourthLab.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО");
        Person person = new Person(in.nextLine());
        try {
            person.setAll();
        }
        catch (Exception ex) {
            System.out.println("Отсутствует Имя и/или Отчество");
        }
        finally {
            System.out.println("Человек: " + person.getSurname() + " " + person.getName().charAt(0) + ". " +
                    person.getPatronymic().charAt(0) + ".");
        }
    }
}
