package ru.downwine._24_TwentyfourthLab.Ex1;

public class Person {
    private String fio;
    private String surname;
    private String name;
    private String patronymic;

    public Person(String fio) {
        setFio(fio);
    }

    public void setAll() {
        String str[] = fio.split(" ");
        surname = str[0];
        name = str [1];
        patronymic = str [2];
    }

    public String getName() {
        return name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getFio() {
        return fio;
    }

    public String getSurname() {
        return surname;
    }
}
