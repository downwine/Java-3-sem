package ru.downwine._6_SixthLab;

public class Main {
    public static void main(String[] args) {
        Movable movableRectangle = new MovableRectangle(1,1,2,-1,1,1);
        System.out.println(movableRectangle);
        movableRectangle.moveUp();
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
