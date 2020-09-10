package ru.downwine.SecondLab.Ex4;
import java.util.Scanner;
public class DogKennels {
    private Dog [] dogs;
    public DogKennels ()
    {
        dogs = new Dog[2]; //Создаём питомник на 2 собаки
    }
    public void addDogs()
    {
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Введите имя собаки: ");
            Scanner in = new Scanner(System.in);
            String dogName = in.next();
            System.out.println("Введите возраст собаки: ");
            int dogAge = in.nextInt();
            dogs[i] = new Dog(dogName, dogAge);
        }
    }
    public void printKennels()
    {
        for (int i = 0; i < dogs.length; i++)
        {
            System.out.println(dogs[i]);
        }
    }

    public static void main(String[] args) {
        DogKennels pit = new DogKennels();
        pit.addDogs();
        pit.printKennels();
    }
}
