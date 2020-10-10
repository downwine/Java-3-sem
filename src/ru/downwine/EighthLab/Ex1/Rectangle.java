package ru.downwine.EighthLab.Ex1;

import java.awt.*;

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle() throws HeadlessException {
        setLength();
        setWidth();
    }

    public void setWidth() {
        this.width = (int)(Math.random() * 150);
    }

    public void setLength() {
        this.length = (int)(Math.random() * 150);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void paintF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        g.fillRect(getX(), getY(), getLength() , getWidth());
    }

}
