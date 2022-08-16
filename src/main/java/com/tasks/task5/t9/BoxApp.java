package com.tasks.task5.t9;

/**
 * Задача 99:
 * Программа выводит объем коробки,
 * стороны формируются случайным образом.
 */
public class BoxApp {

    public static void main(String[] args) {
        int sideW = (int)(Math.random() * 100) + 1;
        int sideH = (int)(Math.random() * 100) + 1;
        int sideL = (int)(Math.random() * 100) + 1;

        Box box = new Box();
        box.width = sideW;
        box.height = sideH;
        box.length = sideL;

        int valueOfBox = (box.width * box.height * box.length);
        System.out.println("Коробка со сторонами:");
        System.out.println(box.width + "x" + box.height + "x" + box.length);
        System.out.println("Объем: " + valueOfBox);
    }
}
