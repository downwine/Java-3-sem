package ru.downwine._7_SeventhLab.Ex3;

public abstract class Furniture {
    private String klass;
    private int size;
    private int cost;
    public abstract void des();

    public int getSize() {
        return size;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Furniture(String klass) {
        this.klass = klass;
        setCost((int) (Math.random() * 100000));
        setSize((int) (Math.random() * 100));
    }

    @Override
    public String toString() {
        return "Furniture {" +
                "klass = '" + klass + '\'' +
                ", size = " + size +
                ", cost = " + cost +
                '}';
    }
}
