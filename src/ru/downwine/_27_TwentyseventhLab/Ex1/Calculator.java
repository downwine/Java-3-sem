package ru.downwine._27_TwentyseventhLab.Ex1;

import java.util.Scanner;

public class Calculator {
    private final Operations o;

    public Calculator(Operations o) {
        this.o = o;
        this.scan();
    }

    public void scan() {
        Scanner in = new Scanner(System.in);
        int a, b;
        char action;
        while (true) {
            try {
                a = in.nextInt();
                b = in.nextInt();
                action = in.next().charAt(0);
                o.count(a, b, action);
                System.out.println("Ответ: " + o.getResult());
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
    }
}
