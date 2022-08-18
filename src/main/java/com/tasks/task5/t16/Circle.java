package com.tasks.task5.t16;

public class Circle {

    int radius;
    String color = "Красный";

    public double areaOfCircle() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double lengthOfCircle() {
        double lengthOf = 2 * Math.PI * radius;
        return lengthOf;
    }
}
