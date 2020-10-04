package ru.downwine.EighthLab.Ex1;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    Circle circle = new Circle();
    Square square = new Square();
    Rectangle rectangle = new Rectangle();

    public void paintComponent(Graphics gr) {
        for (int i = 0; i < 20; i++)
            switch ((int) (Math.random() * 3)) {
                case 0: {
                    circle.setX();
                    circle.setY();
                    circle.setRadius();
                    circle.paintComponents(gr);
                    break;
                }
                case 1: {
                    square.setX();
                    square.setY();
                    square.setSide();
                    square.paintComponents(gr);
                    break;
                }
                case 2: {
                    rectangle.setX();
                    rectangle.setY();
                    rectangle.setWidth();
                    rectangle.setLength();
                    rectangle.paintComponents(gr);
                    break;
                }
            }
    }
}

