package ru.downwine.ThirdLab.Ex2;

public class Arm {
    private boolean broken;
    private int size;
    private String name;
    public void health(){
        if ((int)(Math.random()*10) > 5)
            setBroken(true);
        else setBroken(false);
    }
    public boolean wave () {
        if ((int)(Math.random() * 10) > 5)
            return true;
        else return false;
    }
    public Arm(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Arm {" +
                "broken = " + broken +
                ", size = " + size +
                ", name = '" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isBroken() {
        return broken;
    }
}
