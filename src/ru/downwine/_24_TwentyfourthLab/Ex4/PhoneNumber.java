package ru.downwine._24_TwentyfourthLab.Ex4;

public class PhoneNumber {
    private String number;
    private String answ = "";

    public PhoneNumber(String numb) {
        this.number = numb;
    }

    public void Return() {
        char[] chars = number.toCharArray();
        int k = 0;
        if (!number.contains("+")) {
            answ += "+7";
            for (int i = 1; i < chars.length; i++) {
                if (i == 4 || i == 7)
                    answ += "-";
                answ += String.valueOf(chars[i]);
            }
        }
        else {
            answ += "+";
            for (int i = 1; i < chars.length - 7; i++){
                answ += String.valueOf(chars[i]);
            }
            answ += "-";
            for (int i = chars.length - 7; i < chars.length; i++) {
                if (k == 3)
                    answ += "-";
                k++;
                answ += String.valueOf(chars[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber {" +
                "number = " + answ +
                '}';
    }
}
