package com.tasks.task5.t12;

public class Box {

    int width;
    int height;
    int length;

    public void valueOfBox() {
        System.out.println("Объем = " + (width * height * length));
    }

    public void lengthOfSides() {
        System.out.println("Длина сторон = " + (width + height + length) * 4);
    }
}
