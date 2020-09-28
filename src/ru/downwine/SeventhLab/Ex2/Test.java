package ru.downwine.SeventhLab.Ex2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Husky(5);
        dogs[1] = new Pug(1);
        dogs[2] = new PomSpitz(2);
        System.out.println("Введите имя Хаски: ");
        Scanner in = new Scanner(System.in);
        dogs[0].setName(in.next());
        System.out.println("Введите имя Мопса: ");
        dogs[1].setName(in.next());
        System.out.println("Введите имя Шпица: ");
        dogs[2].setName(in.next());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
