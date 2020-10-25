package ru.downwine._7_SeventhLab.Ex3;
import java.util.Scanner;
public class FurnitureShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Furniture sh = new Wardrobe("Мебель для спальни");
        sh.des(); System.out.println(sh);
        Furniture c = new Chair("Мебель для кухни");
        c.des();
        System.out.println(c);
        Furniture t = new Table("Мебель для кабинета");
        t.des();
        System.out.println(t);
        System.out.println("Что будете покупать?");
        switch (in.next()) {
            case "wardrobe": {
                System.out.println("Вы успешно приобрели шкаф. На вашем счету -" + sh.getCost() + " рублей.");
                break;
            }
            case "chair" : {
                System.out.println("Вы успешно приобрели стул. На вашем счету -" + c.getCost() + " рублей.");
                break;
            }
            case "table" : {
                System.out.println("Вы успешно приобрели стол. На вашем счету -" + t.getCost() + " рублей.");
                break;
            }
        }
    }
}
