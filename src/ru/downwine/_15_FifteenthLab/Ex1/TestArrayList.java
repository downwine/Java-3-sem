package ru.downwine._15_FifteenthLab.Ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(6);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите элемент для добавления:");
            String s = in.next();
            list.add(s);
            //list.add(i, s);
        }
        list.add(2,"Hello");
        ArrayList <String> list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println("Первый лист: " + list);
        System.out.println("Второй лист, с помощью addAll: " + list2);

        ArrayList<String> copyOfList = (ArrayList<String>) list.clone();
        list.clear();
        System.out.println("Копия списка: " + copyOfList);

        System.out.println("Содержится ли в списке \"Hello\": " + list2.contains("Hello"));

        System.out.println("Вывод for each: ");
        for(String s : copyOfList) {
            System.out.println(s);
        }

        copyOfList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("Третий элемент: " + list2.get(2));
        System.out.println("Индекс первого вхождения \"Hello\": " + list2.indexOf("Hello"));
        System.out.println("Список list пустой? " + list.isEmpty());
        list2.remove(2);
        System.out.println("Список после удаления 3 элемента: " + list2);
        list2.remove("Hello");
        System.out.println("Список после удаления \"Hello\" " + list2);
        System.out.println("Размер списка: " + copyOfList.size());

        String[] array = new String[copyOfList.size()];
        copyOfList.toArray(array);
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
