package ru.downwine._14_Fourteenthlab;

public class Student implements Main {
    private final int id;
    private final double average;

    public Student(int id, double average) {
        this.id = id;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public static void binaryFind(Main[] test, int first, int last, double item) {
        long start = System.currentTimeMillis();
        int position;

        position = (first + last) / 2;

        while ((test[position].getAverage()!=item) && (first <= last)) {
            if (test[position].getAverage() > item)
                last = position - 1;
            else
                first = position + 1;
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println("Бинарный поиск: "+ item + " является " + ++position + " элементом в массиве");
            long finish = System.currentTimeMillis();
            long time = finish - start;
            System.out.println("Время поиска "+ time +" м/c");
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.average, average) == 0;
    }

    public static void lineFind(Main[] test, int average) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            if (test[i].getAverage() == average) {
                System.out.println("Линейный поиск: "+ average +" является "+ (i+1) +" элементом в массиве ");
                long finish = System.currentTimeMillis();
                long time = finish - start;
                System.out.println("Время поиска "+ time +" м/c");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Main[] test = new Student[5];
        test[0] = new Student(1, 3.45);
        test[1] = new Student(2, 3.5);
        test[2] = new Student(3, 4.5);
        test[3] = new Student(4, 4.55);
        test[4] = new Student(5, 5);

        binaryFind(test, 1, 5, 5);
        lineFind(test, 5);

    }
}