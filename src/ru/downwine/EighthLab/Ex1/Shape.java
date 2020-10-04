package ru.downwine.EighthLab.Ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected int x, y;
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randColor = new Color(r, g, b);
    public Shape() {
    }

    public Shape(int x, int y, Color randColor) {
        this.x = x;
        this.y = y;
        this.randColor = randColor;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random()*1000);
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = (int)(Math.random()*600);
    }

    abstract void paintComponents(Graphics dr);
}

/*

public abstract class Shape extends JFrame {
    private Color color;
    private int x, y;

    public Color getColor() {
        return color;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void paint(Graphics g);
}
*/
