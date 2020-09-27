package ru.downwine.FifthLab;

public class Main {
    public static void main(String[] args) {
        Movable movableCenter = new MovablePoint(0, 0, 1, 1);
        Movable movableCircle = new MovableCircle(2, (MovablePoint) movableCenter);

        System.out.println(movableCircle);

        movableCircle.moveRight();
        movableCircle.moveUp();

        System.out.println(movableCircle);

        movableCenter.moveDown();
        movableCenter.moveLeft();

        System.out.println(movableCircle);
    }
}
