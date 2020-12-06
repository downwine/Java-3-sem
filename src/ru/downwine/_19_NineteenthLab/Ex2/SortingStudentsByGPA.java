package ru.downwine._19_NineteenthLab.Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAverage() > s2.getAverage())
            return 1;
        else if (s1.getAverage() < s2.getAverage())
            return -1;
        else return 0;
    }

    public static void main(String[] args) {
        ArrayList<Student> students1 = new ArrayList<Student>();
        students1.add(new Student(3, 3.5, "Алексеева"));
        students1.add(new Student(2, 5, "Полукаров"));
        students1.add(new Student(1, 4.5, "Кобелева"));
        students1.add(new Student(4, 4.5, "Казакова"));
        students1.add(new Student(0, 4.6, "Курносова"));

        ArrayList<Student> students2 = new ArrayList<Student>();
        students2.add(new Student(6, 3.35, "Орловский"));
        students2.add(new Student(7, 5, "Гришкина"));
        students2.add(new Student(8, 4.45, "Ивачкина"));
        students2.add(new Student(9, 4.75, "Бутурлак"));
        students2.add(new Student(5, 4.26, "Палий"));

        students1.addAll(students2);

        Collections.sort(students1, new SortingStudentsByGPA());

        for (Student s : students1) {
            System.out.print(s.getAverage() + " ");
        }
    }

}