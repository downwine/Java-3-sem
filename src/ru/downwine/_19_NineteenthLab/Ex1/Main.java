package ru.downwine._19_NineteenthLab.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fio, inn;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО");
        fio = in.nextLine();
        System.out.println("Введите ИНН");
        inn = in.nextLine();
        try {
            if (inn.charAt(0) != '0')
                System.out.println("ИНН не начинается с нуля");
            else
                System.out.println("ИНН не должен начинаться с нуля");
            if (inn.length() != 12)
                System.out.println("В ИНН должно быть 12 символов");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage() + "ИНН некорректный");
        }
        try {
            Integer.parseInt(inn);
            System.out.println("Заказ оформлен: ФИО: " + fio + " ИНН: " + inn);
        }
        catch (NumberFormatException e) {
            System.out.println("ИНН некорректный");
        }
    }
}
