package ru.downwine._27_TwentyseventhLab.Ex3;

import java.awt.*;

public class Fruits {
    private Point point;
    private boolean food;

    public Fruits() {
        point = new Point();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}
