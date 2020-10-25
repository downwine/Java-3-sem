package ru.downwine._7_SeventhLab.Ex2;

public abstract class Dog {
    private int age;
    public String hair;
    public int tall;
    private String name;

    public Dog() {}

    public Dog(int age) {
        this.age = age;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getAge() {
        return age;
    }

    public int getTall() {
        return tall;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHair() {
        return hair;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "age = " + age +
                ", hair = '" + hair + '\'' +
                ", tall = " + tall +
                ", name = '" + name + '\'' +
                '}';
    }

}
