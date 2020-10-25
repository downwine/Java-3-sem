package ru.downwine._1_FirstLab.Ex5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (double n = 1.0; n < 11.0; n++)
            System.out.println(String.format("%.3f", 1.0/n));
    }
}
