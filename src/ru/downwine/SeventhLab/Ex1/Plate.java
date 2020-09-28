package ru.downwine.SeventhLab.Ex1;

import ru.downwine.SeventhLab.Ex1.Dish;

public class Plate extends Dish {

    public Plate(int size) {
        super(size);
    }

    @Override
    public void repaint() {
        setColor("black");
    }

    @Override
    public void fill() {
        setFood("Chicken + potato");
        setDirty(true);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
