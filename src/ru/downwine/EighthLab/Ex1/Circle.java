package ru.downwine.EighthLab.Ex1;

import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = (int)(Math.random()*300);
    }

    public void paintComponents(Graphics gr){
        gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        gr.drawOval(getX(), getY(), getRadius(), getRadius());
    }
}

/*
public class Circle extends Shape {
    private int radius;

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
    }
}*/
