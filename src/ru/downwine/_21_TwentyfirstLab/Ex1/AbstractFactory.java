package ru.downwine._21_TwentyfirstLab.Ex1;

public interface AbstractFactory {
    ComplexNumber create();
    ComplexNumber create(double re, double im);
}
