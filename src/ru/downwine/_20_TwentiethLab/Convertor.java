package ru.downwine._20_TwentiethLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertor<E> {
    private List<E> l = new ArrayList<>();

    public Convertor(E[] array) {
        l.addAll(Arrays.asList(array));
    }

    public void show() {
        System.out.println("show:");
        for (int i = 0; i < 5; i++) {
            System.out.print(l.get(i) + " ");
            if (i == 4)
                System.out.println();
        }
    }

    public void add(E example){
        l.add(example);
    }

    public List getList(){
        return l;
    }

    public void showList(){
        System.out.println("showList:");
        for (Object o: l) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Convertor {" +
                "l = " + l +
                '}';
    }
}
