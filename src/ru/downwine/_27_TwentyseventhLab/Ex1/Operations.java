package ru.downwine._27_TwentyseventhLab.Ex1;

public class Operations {
    private int res;

    public void count(int a, int b, char action){
        try {
            switch (action) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    if (b != 0)
                        res = a / b;
                    else
                        System.out.println("Infinity");
                    break;
                default: throw new Exception();
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getResult() {
        return res;
    }
}
