package ru.downwine.FourthLab;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println("Введите фигуру, которую хотите создать: ");
        Scanner in = new Scanner(System.in);
        String f = in.next();
        switch (f) {
            case "circle": {
                System.out.println("Введите радиус круга: ");
                double r = in.nextDouble();
                System.out.println("Введите цвет: ");
                String c = in.next();
                Circle circle = new Circle(r);
                circle.setColor(c);
                if ((int)(Math.random() * 10) > 5) {
                    circle.setFilled(true);
                }
                System.out.println("Площадь круга: " + circle.getArea());
                System.out.println("Длина окружности: " + circle.getPerimeter());
                System.out.println(circle);
                break;
            }
            case "rectangle": {
                System.out.println("Введите длину и ширину: ");
                double l = in.nextDouble();
                double w = in.nextDouble();
                System.out.println("Введите цвет: ");
                String c = in.next();
                Rectangle rectangle = new Rectangle(w,l);
                rectangle.setColor(c);
                if ((int)(Math.random() * 10) > 5) {
                    rectangle.setFilled(true);
                }
                System.out.println("Площадь прямоугольника: " + rectangle.getArea());
                System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
                System.out.println(rectangle);
                break;
            }
            case "square": {
                System.out.println("Введите сторону: ");
                double s = in.nextDouble();
                System.out.println("Введите цвет: ");
                String c = in.next();
                Square square = new Square();
                square.setSide(s);
                square.setColor(c);
                if ((int)(Math.random() * 10) > 5) {
                    square.setFilled(true);
                }
                System.out.println("Площадь квадрата: " + square.getArea());
                System.out.println("Периметр квадрата: " + square.getPerimeter());
                System.out.println(square);
                break;
            }
            default: {
                System.out.println("Вы ввели неправильно.");
            }
        }
    }
}
