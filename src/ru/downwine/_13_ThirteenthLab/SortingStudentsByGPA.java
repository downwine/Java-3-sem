package ru.downwine._13_ThirteenthLab;

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
        students1.add(new Student(3, 3.5));
        students1.add(new Student(2, 5));
        students1.add(new Student(1, 4.5));
        students1.add(new Student(4, 4.5));
        students1.add(new Student(0, 4.6));

        ArrayList<Student> students2 = new ArrayList<Student>();
        students2.add(new Student(6, 3.35));
        students2.add(new Student(7, 5));
        students2.add(new Student(8, 4.45));
        students2.add(new Student(9, 4.75));
        students2.add(new Student(5, 4.26));

        students1.addAll(students2);

        Collections.sort(students1, new SortingStudentsByGPA());

        for (Student s : students1) {
            System.out.print(s.getAverage() + " ");
        }
    }

}