package ru.downwine._7_SeventhLab.Ex1;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Dish cup = new Cup(600);
        Dish pan = new Pan(24);
        Dish pot = new Pot(56);
        Dish plate = new Plate(20);
        System.out.println("Введите цвет для чашки: ");
        Scanner in = new Scanner(System.in);
        cup.setColor(in.next());
        System.out.println(cup);
        cup.fill();
        cup.repaint();
        System.out.println(cup);

        System.out.println("Введите цвет для сковороды: ");
        pan.setColor(in.next());
        System.out.println(pan);
        pan.fill();
        pan.repaint();
        System.out.println(pan);

        System.out.println("Введите цвет для кастрюли: ");
        pot.setColor(in.next());
        System.out.println(pot);
        pot.fill();
        pot.repaint();
        System.out.println(pot);

        System.out.println("Введите цвет для тарелки: ");
        plate.setColor(in.next());
        System.out.println(plate);
        plate.fill();
        plate.repaint();
        System.out.println(plate);
    }
}
