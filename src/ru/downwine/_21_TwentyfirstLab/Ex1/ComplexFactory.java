package ru.downwine._21_TwentyfirstLab.Ex1;

public abstract class ComplexFactory implements AbstractFactory {
    @Override
    public ComplexNumber create() {
        return new ComplexNumber();
    }

    @Override
    public ComplexNumber create(double re, double im) {
        return new ComplexNumber(re, im);
    }
}
