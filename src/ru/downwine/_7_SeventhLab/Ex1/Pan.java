package ru.downwine._7_SeventhLab.Ex1;

public class Pan extends Dish {
    @Override
    public void repaint() {
        setColor("blue");
    }

    @Override
    public void fill() {
        setFood("pancakes");
        setDirty(true);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Pan(int size) {
        super(size);
    }
}
