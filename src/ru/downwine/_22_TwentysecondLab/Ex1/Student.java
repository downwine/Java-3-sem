package ru.downwine._22_TwentysecondLab.Ex1;

public class Student {
    private int id;
    private String fio;
    private double average;
    private String dateOfBirth;

    public Student(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

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

    public String toString(String way) {
        String[] date = dateOfBirth.split("\\.");
        char[] chars = date[2].toCharArray();
        if (way.equals("1"))
            return date[0] + "." + date[1] + "." + chars[2] + chars[3];
        if (way.equals("2"))
            return date[0] + "." + date[1] + "." + date[2];
        if (way.equals("3"))
            switch (date[1]) {
                case "01":
                    return date[0] + " января " + date[2] + " года";
                case "02":
                    return date[0] + " февраля " + date[2] + " года";
                case "03":
                    return date[0] + " марта " + date[2] + " года";
                case "04":
                    return date[0] + " апреля " + date[2] + " года";
                case "05":
                    return date[0] + " мая " + date[2] + " года";
                case "06":
                    return date[0] + " июня " + date[2] + " года";
                case "07":
                    return date[0] + " июля " + date[2] + " года";
                case "08":
                    return date[0] + " августа " + date[2] + " года";
                case "09":
                    return date[0] + " сентября " + date[2] + " года";
                case "10":
                    return date[0] + " октября " + date[2] + " года";
                case "11":
                    return date[0] + " ноября " + date[2] + " года";
                case "12":
                    return date[0] + " декабря " + date[2] + " года";
            }
        return "";
    }
}


