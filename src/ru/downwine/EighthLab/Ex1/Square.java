package ru.downwine.EighthLab.Ex1;

import java.awt.*;

public class Square extends Shape{
    private int side;

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide() {
        this.side = (int)(Math.random()*300);
    }

    public void paintComponents(Graphics gr){
        gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        gr.drawRect(getX(), getY(), getSide(), getSide());
    }
}
/*
public class Square extends Shape {
    private int side;

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
    }
}*/
