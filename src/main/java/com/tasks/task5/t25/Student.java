package com.tasks.task5.t25;

public class Student {

    String name;

    public String gratter(int mark) {
        String str = "Студент " + name + " получил(а) " + mark;
        if (mark < 5) {
            str = str + ", плохая оценка";
        } else {
            str = str + ", хорошая оценка";
        }

        return str;
    }
}
