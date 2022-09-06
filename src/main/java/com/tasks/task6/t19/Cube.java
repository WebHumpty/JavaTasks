package com.tasks.task6.t19;

public class Cube {

    private int width;
    private int height;
    private int length;
    private String color;

    public Cube() {
        width = 20;
        height = 20;
    }

    public void outCube() {
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Длина: " + length);
        System.out.println("Цвет: " + color);
    }
}
