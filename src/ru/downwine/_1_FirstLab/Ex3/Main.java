package ru.downwine._1_FirstLab.Ex3;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 11; i++)
            sum += array[i];
        System.out.println("Сумма with for = " + sum);
        int i = 0;
        sum = 0;
        while (i < 11)
        {
            sum += array[i];
            i++;
        }
        System.out.println("Сумма with while = " + sum);
        i = 0;
        sum = 0;
        do
        {
            sum += array[i];
            i++;
        }
        while (i < 11);
        System.out.println("Сумма with do while = " + sum);
    }
}
