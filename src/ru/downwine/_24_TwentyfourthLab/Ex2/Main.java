package ru.downwine._24_TwentyfourthLab.Ex2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static Address stringTokenizer(String address, String d) {
        StringTokenizer tokenizer = new StringTokenizer(address, " " + d);
        return new Address(tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken(),
                tokenizer.nextToken(), tokenizer.nextToken(), tokenizer.nextToken());
    }

    public static void main(String[] args) {
        System.out.println("Введите адрес через запятую:");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Address address = new Address(s);
        address.converting(s);
        System.out.println(address.toString());
        System.out.println("Введите разделитель:");
        String d = in.next();
        System.out.println("Введите адрес:");
        s = in.next();
        System.out.println(stringTokenizer(s, d));
    }
}
