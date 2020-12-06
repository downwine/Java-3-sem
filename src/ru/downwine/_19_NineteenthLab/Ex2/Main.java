package ru.downwine._19_NineteenthLab.Ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    Student[] students = new Student[5];
    int[] IDNumber = new int[5];

    public Main() {
        students[0] = new Student(4, 3.23, "Громов");
        students[1] = new Student(5, 4.23, "Елсукова");
        students[2] = new Student(3, 5, "Шевченко");
        students[3] = new Student(1, 4.5, "Минакова");
        students[4] = new Student(2, 4.6, "Антошин");
    }

    public void sortIDNumber() {
        for (int i = 0; i < 5; i++)
            IDNumber[i] = students[i].getId();
        for (int i = 0; i < IDNumber.length - 1; i++) {
            for (int j = IDNumber.length - 1; j > i; j--) {
                if (IDNumber[j - 1] > IDNumber[j]) {
                    double tmp = IDNumber[j - 1];
                    IDNumber[j - 1] = IDNumber[j];
                    IDNumber[j] = (int) tmp;
                }
            }
        }
        for (int i = 0; i < 5; i++)
            System.out.print(IDNumber[i]+" ");
    }

    public void SearchForFio(String fio) {
        boolean check = false;
        for (Student student : students) {
            if (student.getFio().equals(fio)) {
                System.out.println(student.getId() + " " + student.getAverage() + " " + student.getFio());
                check = true;
            }
        }
        if (!check) {
            System.out.println("Не найдено");
        }
    }

    public void SortFio() {
        SortingStudentByFIO sortingStudentByFIO = new SortingStudentByFIO();
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.addAll(Arrays.asList(students));
        Collections.sort(studentArrayList, sortingStudentByFIO);
        for (Student s : studentArrayList)
            System.out.print(s.getFio()+" ");
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int[] getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int[] IDNumber) {
        this.IDNumber = IDNumber;
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.sortIDNumber();
    }
}
