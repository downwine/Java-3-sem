package ru.downwine._7_SeventhLab.Ex3;

import java.util.Scanner;

public class Chair extends Furniture{
    private boolean occupied;

    public Chair(String klass) {
        super(klass);
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }

    @Override
    public void des() {
        System.out.println("Сесть на стул? y/n");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "y": {
                System.out.println("Вы сели на стул");
                setOccupied(true);
                break;
            }
            case "n": {
                System.out.println("Вы не сели на стул");
                setOccupied(false);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Chair {" +
                "occupied = " + occupied +
                '}';
    }
}
