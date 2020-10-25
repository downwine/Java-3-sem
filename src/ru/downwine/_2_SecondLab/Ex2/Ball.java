package ru.downwine._2_SecondLab.Ex2;

public class Ball {
    private String color, size;
    private int price;
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }
    public Ball (String color, String size, int price) {
        setColor(color);
        setSize(size);
        setPrice(price);
    }
    @Override
    public String toString() {
        return "Ball {" +
                "color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                ", price = " + price +
                '}';
    }
}
