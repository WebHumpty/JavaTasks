package com.tasks.task6.t23;

public class Cube {

    private int width;
    private int height;
    private int length;
    private String color;

    public Cube(int w, int h, int l, String c) {
        this.width = w;
        this.height = h;
        this.length = l;
        this.color = c;
    }

    public void outCube() {
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Длина: " + length);
        System.out.println("Цвет: " + color);
        System.out.println();
    }
}
