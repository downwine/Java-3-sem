package ru.downwine.SeventhLab.Ex1;

import ru.downwine.SeventhLab.Ex1.Dish;

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
