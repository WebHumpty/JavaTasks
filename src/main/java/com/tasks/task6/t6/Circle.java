package com.tasks.task6.t6;

public class Circle {

    String color;

    public double areaOfCircle(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double areaOfCircle(String radius) {
        int r = Integer.parseInt(radius);
        double area = Math.PI * r * r;
        return area;
    }
}
