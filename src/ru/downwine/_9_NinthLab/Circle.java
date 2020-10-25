package ru.downwine._9_NinthLab;

import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle() throws HeadlessException {
        this.radius = (int)(Math.random() * 150);
    }

    @Override
    public void paintF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        g.fillOval(getX(), getY(), radius , radius);
    }
}
