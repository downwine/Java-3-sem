package ru.downwine.ThirdLab.Ex1;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Введите радиус и имя окружности: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        String n = in.next();
        Circle circle = new Circle();
        circle.setName(n);
        circle.setRadius(r);
        circle.setPerimeter(2*Math.PI* circle.getRadius());
        circle.setSquare(Math.PI * circle.getRadius() * circle.getRadius());
        System.out.println(circle);
    }
}
