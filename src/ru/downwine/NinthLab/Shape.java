package ru.downwine.NinthLab;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {
    private Color color;
    private int x, y;

    public Shape() throws HeadlessException {
        setColor();
        setX();
        setY();
    }

    public Color getColor() {
        return color;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random() * 700);
    }

    public void setY() {
        this.y = (int)(Math.random() * 600);
    }

    public void setColor() {
        Color color = new Color ((int)(Math.random() * 255),
                (int)(Math.random() * 255), (int)(Math.random() * 255));
        Color white = new Color(255, 255, 255);
        if (color != white)
            this.color = color;
    }

    public abstract void paintF(Graphics g);
}

