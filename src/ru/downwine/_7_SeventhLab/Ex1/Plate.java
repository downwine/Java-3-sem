package ru.downwine._7_SeventhLab.Ex1;

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
