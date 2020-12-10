package ru.downwine._25_TwentyfifthLab.Ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str;
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matchers = pattern.matcher(str);
        do {
            str = matchers.replaceAll("");
            matchers = pattern.matcher(str);
        }
        while (matchers.find());
        if (str.matches("[\\d+/*-]*"))
            System.out.println(str1);
    }
}
