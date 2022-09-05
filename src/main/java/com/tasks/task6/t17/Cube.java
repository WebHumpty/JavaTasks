package com.tasks.task6.t17;

public class Cube {

    public int width;
    public int height;
    public int length;
    String color;

    public Cube() {
        this.width = 10;
        this.height = 10;
        this.length = 10;
        this.color = "красный";
    }

    public void outCube() {
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Длина: " + length);
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}
