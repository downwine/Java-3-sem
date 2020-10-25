package ru.downwine._1_FirstLab.Ex7;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        System.out.println("Считаем факториал от: " + a);
        System.out.println("Ответ: " + factorial(a));
    }
    public static int factorial(int f)
    {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * factorial(f - 1);
        }
    }
}
