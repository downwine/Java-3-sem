package ru.downwine._22_TwentysecondLab.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String fio = scanner.nextLine();
        System.out.println("Фамилия разработчика: " + fio);
        task.getStart();
        task.getFinish();
    }
}
