package ru.downwine.ThirdLab.Ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите стрижку, цвет волос и диаметр головы: ");
        Scanner in = new Scanner(System.in);
        String h = in.next();
        String c = in.next();
        int d = in.nextInt();
        Head head = new Head(h,c,d);
        System.out.println(head);
        if (head.nod())
            System.out.println("Вам кивнули.");
        else System.out.println("Вам не кивнули.");
        System.out.println("Введите размер ноги, имя ноги");
        d = in.nextInt();
        h = in.next();
        Leg leg = new Leg(d,h);
        leg.treatment();
        System.out.println(leg);
        System.out.println("Введите размер ноги, имя ноги");
        d = in.nextInt();
        h = in.next();
        leg = new Leg(d,h);
        leg.treatment();
        System.out.println(leg);
        System.out.println("Введите размер и имя руки: ");
        d = in.nextInt();
        h = in.next();
        Arm arm = new Arm(d,h);
        if (arm.wave())
            System.out.println("Вам махнули.");
        else System.out.println("вам не махнули.");
        System.out.println(arm);
        System.out.println("Введите размер и имя руки: ");
        d = in.nextInt();
        h = in.next();
        arm = new Arm(d,h);
        if (arm.wave())
            System.out.println("Вам махнули.");
        else System.out.println("вам не махнули.");
        System.out.println(arm);
    }
}
