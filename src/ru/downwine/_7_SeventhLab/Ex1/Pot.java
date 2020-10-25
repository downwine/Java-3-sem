package ru.downwine._7_SeventhLab.Ex1;

public class Pot extends Dish {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void repaint() {
        setColor("grey");
    }

    @Override
    public void fill() {
        setFood("soup");
    }

    public Pot(int size) {
        super(size);
    }
}
