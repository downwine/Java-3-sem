package ru.downwine.ThirdLab.Ex2;
import java.util.Scanner;
public class Leg {
    private int size;
    private String name;
    private boolean pedicure;
    private String pedicureColor;

    public Leg(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "size = " + size +
                ", name = '" + name + '\'' +
                ", pedicure = " + pedicure +
                ", pedicureColor = '" + pedicureColor + '\'' +
                '}';
    }

    public void treatment(){
        if ((int)(Math.random()*10) > 5)
            setPedicure(true);
        else setPedicure(false);
        if (isPedicure()){
            System.out.println("Введите цвет педикюра: ");
            Scanner in = new Scanner(System.in);
            String c = in.next();
            setPedicureColor(c);
        }
    }
    public void setPedicureColor(String pedicureColor) {
        this.pedicureColor = pedicureColor;
    }

    public void setPedicure(boolean pedicure) {
        this.pedicure = pedicure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPedicureColor() {
        return pedicureColor;
    }

    public boolean isPedicure() {
        return pedicure;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
