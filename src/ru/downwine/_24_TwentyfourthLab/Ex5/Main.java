package ru.downwine._24_TwentyfourthLab.Ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String text = Files.readString(Path.of(path));
        String[] words = text.split(" ");
        System.out.println(getLine(words).toString());
    }

    public static StringBuilder getLine(String[] words) {
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0)
            return result;
        if (words.length == 1 || words[0].equals(""))
            return result.append(words[0]);
        List<String> list = Arrays.asList(words);
        while (!isValid(list))
            Collections.shuffle(list);

        for (int i = 0; i < list.size() - 1; i++) {
            result.append(list.get(i)).append(" ");
        }
        result.append(list.get(list.size() - 1));
        return result;
    }

    public static boolean isValid(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            String word0 = words.get(i).toLowerCase();
            String word1 = words.get(i+1).toLowerCase();
            if (word0.charAt(word0.length() - 1) != word1.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}