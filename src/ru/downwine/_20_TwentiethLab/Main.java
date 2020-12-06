package ru.downwine._20_TwentiethLab;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 3, 4};
        Convertor<Integer> mass = new Convertor(array);
        mass.showList();
        mass.show();

        String[] s = {"Zero", "One", "Two", "Three", "Four"};
        Convertor<String> string = new Convertor(s);
        string.showList();
        string.show();
    }
}
