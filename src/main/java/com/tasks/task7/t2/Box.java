package com.tasks.task7.t2;

public class Box {

    public int width;
    public int height;
    public int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void increase1(int width, int height, int length) {
        System.out.println();
        width = width * 2;
        height = height * 2;
        length = length * 2;
        System.out.println("По значению");
        System.out.println();
    }

    public void increase2(Box box) {
        System.out.println();
        box.width = box.width * 2;
        box.height = box.height * 2;
        box.length = box.length * 2;
        System.out.println("По ссылке");
        System.out.println();
    }
}
