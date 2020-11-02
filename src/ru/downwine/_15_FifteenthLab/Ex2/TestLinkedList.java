package ru.downwine._15_FifteenthLab.Ex2;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList { //Двусвязный список
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите элемент для добавления:");
            String s = in.next();
            linkedlist.add(s);
            //linkedlist.add(i, s);
        }
        linkedlist.add(2,"Hello");
        System.out.println(linkedlist);

        System.out.println("Индекс \"Hello\": " + linkedlist.indexOf("Hello"));
        System.out.println("Содержится ли в списке \"Hello\": " + linkedlist.contains("Hello"));
        System.out.println("Размер списка: " + linkedlist.size());

        linkedlist.remove("Hello");
        System.out.println(linkedlist);

        linkedlist.addLast("Hi");
        linkedlist.addFirst("Hi");
        System.out.println(linkedlist);

        System.out.println("Первый элемент: " + linkedlist.peekFirst());
        System.out.println("Последний элемент: " + linkedlist.peekLast());

        System.out.println(linkedlist.pollFirst());
        System.out.println(linkedlist.pollLast());
        System.out.println(linkedlist);


    }
}
