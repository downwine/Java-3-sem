package ru.downwine._4_FourthLab;

public class Square extends Rectangle {
    protected double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square {" +
                "side = " + side +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}
