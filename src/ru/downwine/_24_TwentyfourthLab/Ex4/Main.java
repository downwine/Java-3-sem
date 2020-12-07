package ru.downwine._24_TwentyfourthLab.Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите: +<Код страны><Номер 10 цифр>, например “+79175655655” или\n" +
                "8<Номер 10 цифр> для России, например “89175655655“");
        Scanner scanner = new Scanner(System.in);
        PhoneNumber phoneNumber = new PhoneNumber(scanner.nextLine());
        phoneNumber.Return();
        System.out.println(phoneNumber.toString());
    }
}
