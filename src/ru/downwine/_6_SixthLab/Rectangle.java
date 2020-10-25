package ru.downwine._6_SixthLab;

import ru.downwine._4_FourthLab.Shape;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return (getWidth() * getLength());
    }

    @Override
    public double getPerimeter() {
        return (2 * (getLength() + getWidth()));
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width = " + width +
                ", length = " + length +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}
