package ru.downwine._22_TwentysecondLab.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату рождения");
        Student student = new Student(in.nextLine());
        System.out.println("Введите формат даты: 1 - короткий;\n2 - средний;\n3 - полный.");
        System.out.println(student.toString(in.nextLine()));
    }
}
