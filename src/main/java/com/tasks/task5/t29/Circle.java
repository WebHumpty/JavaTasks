package com.tasks.task5.t29;

public class Circle {

    String color;
    int radius;

    public double areaS(int a, int b) {
        int angle = Math.abs(a - b);
        double area = Math.PI * radius * radius * angle / 360;
        return area;
    }

    public double lengthOfArk(int a, int b) {
        int angle = Math.abs(a - b);
        double area = 2 * Math.PI * radius * angle / 360;
        return area;
    }
}
