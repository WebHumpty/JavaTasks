package com.tasks.task5.t15;

public class Student {

    String name;
    int mathematics;
    int english;
    int physics;

    public void medium() {
        double m = ((double) + mathematics + (double)english + (double)physics) / 3;
        System.out.println("Средняя оценка: " + m);
    }

    public void greeting() {
        System.out.println("Поздравляем, " + name + ", со здачей экзаменов.");
    }
}
