package ru.downwine._7_SeventhLab.Ex1;

public abstract class Dish {
    private int size;
    private boolean dirty;
    private String color;
    private String food;

    public abstract void fill();

    public abstract void repaint();

    public Dish(int size) {
        this.size = size;
    }

    public void wash() {
        setDirty(false);
    }

    public boolean isDirty() {
        return dirty;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getFood() {
        return food;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dish {" +
                "size = " + size +
                ", dirty = " + dirty +
                ", color = '" + color + '\'' +
                '}';
    }
}
