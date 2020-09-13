package ru.downwine.FirstLab.Ex6;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    int[] array = new int[10];
    System.out.println("Массив до сортировки:");
    for (int i = 0; i < array.length; i++)
    {
        array[i] = (int) ((Math.random() * 100));
        System.out.println("Число " + (i+1) + " = " + array[i]);
    }
    Arrays.sort(array);
    System.out.println("Новый массив:");
    for (int i = 0; i < array.length; i++){
        System.out.println("Число " + (i+1) + " = " + array[i]);
    }
    for (int i = 0; i < array.length; i++)
            array[i] = 0;
    System.out.println("Создаем массив с помощью Rand:");
    Random random = new Random();
    for (int i = 0; i < array.length; i++)
    {
        array[i] = (int) (random.nextInt(100));
        System.out.println("Число " + (i+1) + " = " + array[i]);
    }
    Arrays.sort(array);
    System.out.println("Новый массив:");
    for (int i = 0; i < array.length; i++){
        System.out.println("Число " + (i+1) + " = " + array[i]);
    }
}
}
