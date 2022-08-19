package com.tasks.task5.t20;

public class Triangle {

    int base;
    int height;
    String color = "Красный";

    public double areaOfTriangle() {
        double area = base * height / 2;
        return area;
    }

    public String triangle() {
        String string = (color + " треугольник с высотой " + height + " основанием " + base);
        return string;
    }
}
