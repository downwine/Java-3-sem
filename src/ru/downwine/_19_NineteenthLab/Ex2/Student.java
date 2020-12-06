package ru.downwine._19_NineteenthLab.Ex2;

public class Student {
    private int id;
    private String fio;
    private double average;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public Student(int id, double average, String fio) {
        this.id = id;
        this.average = average;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
