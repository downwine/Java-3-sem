package ru.downwine._16_SixteenthLab;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinker {
    private final static ArrayList<Integer> first = new ArrayList<>();
    private final static ArrayList<Integer> second = new ArrayList<>();
    private final static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int counter = 0;

        for (int i = 0; i < 5; i++)
            first.add(scn.nextInt());
        for (int i = 0; i < 5; i++)
            second.add(scn.nextInt());

        while (first.size() > 0 && second.size() > 0) {
            gamePlay();
            counter++;

            if (counter > 106) {
                System.out.println("botva");
                System.exit(1);
            }
        }

        if (first.size() == 0)
            System.out.println("second " + counter);

        else System.out.println("first " + counter);
    }

    public static void gamePlay() {
        if (!(first.get(0) == 0 && second.get(0) == 9 || first.get(0) == 9 && second.get(0) == 0))
            if (first.get(0) > second.get(0)) {
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            } else {
                second.add(second.get(0));
                second.add(first.get(0));
                second.remove(0);
                first.remove(0);
            }
        else {
            if (first.get(0) > second.get(0)) {
                second.add(second.get(0));
                second.add(first.get(0));
                second.remove(0);
                first.remove(0);
            } else {
                first.add(first.get(0));
                first.add(second.get(0));
                first.remove(0);
                second.remove(0);
            }
        }
    }
}