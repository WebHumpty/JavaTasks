package com.tasks.task5.t36;

public class Circle {
    // формула сектора круга = пи*r*r*n/360
    // формула длины дуги круга = 2*пи*r*n/360,
    // где пи-число пи, r-радиус, n-угол сектора в градусах

    static String nameOfCircle = "Круг";

    static public double areaOfS(int a, int b, int radius) {
        int angle = Math.abs(a - b);
        double area = Math.PI * radius * radius * angle / 360;
        return area;
    }

    static public double lengthOfArk(int a, int b, int radius) {
        int angle = Math.abs(a - b);
        double area = 2 * Math.PI * radius * angle / 360;
        return area;
    }

    static public double lengthOfCircle(int radius) {
        double area = 2 * Math.PI * radius;
        return area;
    }

    static public double areaOfC(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
