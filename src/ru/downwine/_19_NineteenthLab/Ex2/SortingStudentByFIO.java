package ru.downwine._19_NineteenthLab.Ex2;

import java.util.Comparator;

public class SortingStudentByFIO implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFio().compareTo(s2.getFio());
    }
}
