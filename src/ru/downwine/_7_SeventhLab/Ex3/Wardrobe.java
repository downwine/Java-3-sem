package ru.downwine._7_SeventhLab.Ex3;
import java.util.Scanner;
public class Wardrobe extends Furniture {
    private boolean state;

    public Wardrobe(String klass) {
        super(klass);
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    @Override
    public void des() {
        System.out.println("Открыть шкаф? y/n");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "y": {
                System.out.println("Вы открыли шкаф");
                setState(true);
                break;
            }
            case "n": {
                System.out.println("Вы не стали открывать шкаф");
                setState(false);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Wardrobe {" +
                "state = " + state +
                '}';
    }
}
