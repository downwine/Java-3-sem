package ru.downwine.SeventhLab.Ex3;
import java.util.Scanner;
public class Table extends Furniture {
    private int k;
    private boolean done;

    public Table(String klass) {
        super(klass);
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getK() {
        return k;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public void des() {
        System.out.println("Представить, что вы накрываете на стол? y/n");
        Scanner in = new Scanner(System.in);
        switch (in.next()) {
            case "y": {
                System.out.println("Вы решили накрыть на стол. Сколько персон будет?");
                setDone(true);
                this.setK(in.nextInt());
                break;
            }
            case "n": {
                System.out.println("Вы решили не накрывать на стол.");
                setDone(false);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Table {" +
                "k = " + k +
                ", done = " + done +
                '}';
    }
}
