package ru.downwine._21_TwentyfirstLab.Ex1;

public class ComplexNumber {
    private double Re;
    private double Im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        Re = re;
        Im = im;
    }

    public void setIm(double im) {
        Im = im;
    }

    public void setRe(double re) {
        Re = re;
    }

    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
    }
}
