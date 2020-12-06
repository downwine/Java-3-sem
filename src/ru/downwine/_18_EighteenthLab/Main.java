package ru.downwine._18_EighteenthLab;

import java.util.Scanner;

public class Main {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String string = scanner.next();
        int i = Integer.parseInt(string);
        try {
            if (2.0 / i != Float.POSITIVE_INFINITY)
                System.out.println("Ответ: " + 2.0 / i);
            else
                System.out.println("Ответ: бесконечность");
        }
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage() + "Невозможно деление на 0");
        }
        finally {
            System.out.println("Конец программы");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.exceptionDemo();
    }
}
