package ru.downwine._23_TwentythirdLab.Ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> mass = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите города России");
        for (int i = 0; i < 5; i++) {
            mass.add(in.next());
        }
        System.out.println("Вводите города Европы");
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(in.next());
        }
        map.put("Россия", mass);
        map.put("Европа", arr);
        System.out.println(map.get("Россия"));
        System.out.println(map.get("Европа"));
    }
}
