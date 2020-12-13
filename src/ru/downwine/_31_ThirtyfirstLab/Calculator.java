package ru.downwine._31_ThirtyfirstLab;

public class Calculator {
    private final double a, b;
    private final char action;
    private double res;

    public Calculator(int a, int b, char action) {
        this.a = a;
        this.b = b;
        this.action = action;
        calculate();
    }

    public void calculate() {
        switch (action) {
            case '+':
                res = b + a;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
    }

    public double getResult() {
        return res;
    }

    public double getA() {
        return a;
    }
}
