package ru.downwine._24_TwentyfourthLab.Ex3;

public class Shirt {
    private String article, name, color, size;

    public Shirt(String s) {
        try {
            String[] str = s.split(",");
            article = str[0];
            name = str[1];
            color = str[2];
            size = str[3];
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Shirt {" +
                "article = '" + article + '\'' +
                ", name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}
