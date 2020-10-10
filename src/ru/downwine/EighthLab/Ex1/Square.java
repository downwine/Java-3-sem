package ru.downwine.EighthLab.Ex1;

import java.awt.*;

public class Square extends Shape {
    private int side;

    public Square() throws HeadlessException {
       setSide();
    }

    public int getSide() {
        return side;
    }

    public void setSide() {
        this.side = (int)(Math.random() * 150);
    }

    @Override
    public void paintF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setPaint(getColor());
        g.fillRect(getX(), getY(), getSide(), getSide());
    }
}
