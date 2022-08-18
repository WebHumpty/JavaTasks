package com.tasks.task5.t18;

public class Student {

    String name;
    int mathematics;
    int english;
    int physics;

    public String greeting() {
        String string = name + ", поздравляем, ВЫ написала экзамены";
        return string;
    }

    public double midleMark() {
        double m = ((double)mathematics + (double)(english) + (double)(physics)) / 3;
        return m;
    }
}
