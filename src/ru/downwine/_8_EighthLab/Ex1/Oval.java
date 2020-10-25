package ru.downwine._8_EighthLab.Ex1;

import java.awt.*;

public class Oval extends Shape {
    private int width, height;

    public Oval() throws HeadlessException {
        setHeight();
        setWidth();
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = (int)(Math.random() * 150);
    }

    public void setHeight() {
        this.height = (int)(Math.random() * 150);
    }

    @Override
    public void paintF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        setColor();
        g.fillOval(getX(), getY(), getWidth() , getHeight());
    }
}
