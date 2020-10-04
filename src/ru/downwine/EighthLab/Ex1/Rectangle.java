package ru.downwine.EighthLab.Ex1;

import java.awt.*;
import java.awt.*;

public class Rectangle extends Shape{
    private int width, length;

    public Rectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = (int)(Math.random()*300);
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        this.length = (int)(Math.random()*300);
    }

    public void paintComponents(Graphics gr){
        gr.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
        gr.drawRect(getX(), getY(), getWidth(), getLength());
    }
}

/*
public class Rectangle extends Shape {
    private int length, width;

    @Override
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

    }

}*/
