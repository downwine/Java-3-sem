package ru.downwine.SecondLab.Ex2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите цвет, размер и цену мяча: ");
        Scanner in = new Scanner(System.in);
        String ballColor = in.next(), ballSize = in.next();
        int ballPrice = in.nextInt();
        Ball ball = new Ball(ballColor, ballSize, ballPrice);
        System.out.println(ball);
        System.out.println("Введите новый цвет: ");
        ballColor = in.next();
        ball.setColor(ballColor);
        System.out.println(ball);
    }
}
