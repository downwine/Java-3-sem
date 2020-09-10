package ru.downwine.SecondLab.Ex4;

public class Dog {
    private String name;
    private int age;
    public Dog (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public int AgeToHuman (int dogAge)
    {
        return dogAge * 7;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
