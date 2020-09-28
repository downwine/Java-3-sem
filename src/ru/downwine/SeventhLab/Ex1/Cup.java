package ru.downwine.SeventhLab.Ex1;

public class Cup extends Dish {
    public Cup(int size) {
        super(size);
    }

    @Override
    public void fill() {
        setDirty(true);
        setFood("tea");
    }

    @Override
    public void repaint() {
        setColor("red");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
