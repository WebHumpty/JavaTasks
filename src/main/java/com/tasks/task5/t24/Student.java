package com.tasks.task5.t24;

public class Student {

    String name;

    public String gratter(int mark) {
        String string = "Студент " + name + " получил(а) " + mark;
        if (mark < 5) {
            string = string + ", плохая оценка";
        } else {
            string = string + ", хорошая оценка";
        }

        return string;
    }
}
