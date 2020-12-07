package ru.downwine._22_TwentysecondLab.Ex3;

import java.util.Date;

public class Task {
    private Date start;
    private Date finish;

    public void getStart(){
        Date start = new Date();
        System.out.println("Задание взято: " + start);
    }

    public void getFinish(){
        Date finish = new Date();
        System.out.println("Задание сдано: " + finish);
    }
}
