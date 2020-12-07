package ru.downwine._21_TwentyfirstLab.Ex1;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public double getRe() {
        return re;
    }
}
