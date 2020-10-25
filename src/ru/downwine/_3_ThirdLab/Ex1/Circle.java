package ru.downwine._3_ThirdLab.Ex1;

public class Circle {
    private int radius;
    private double perimeter;
    private double square;
    private String name;

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public int getRadius() {
        return radius;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                ", perimeter = " + perimeter +
                ", square = " + square +
                ", name = '" + name + '\'' +
                '}';
    }
}