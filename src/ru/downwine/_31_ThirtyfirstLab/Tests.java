package ru.downwine._31_ThirtyfirstLab;

import org.junit.Test;

public class Tests {
    @Test()
    public void calculate() {
        Calculator calculator = new Calculator(2, 3, '+');
        double a = calculator.getResult();
    }

    @Test(expected = ArithmeticException.class)
    public void calculate1() {
        Calculator calculator = new Calculator(2, 3, '*');
        double a = (int)(calculator.getResult())/0;
    }

    @Test()
    public void calculate2() {
        Calculator calculator = new Calculator(2, 3, '*');
        double a = calculator.getResult()/0;
    }
}
