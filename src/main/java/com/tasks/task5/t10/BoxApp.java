package com.tasks.task5.t10;

/**
 * Задача 100:
 * Программа выводит объем коробки.
 */
public class BoxApp {

    public static void main(String[] args) {
        Box box = new Box();
        int valueOfBox = (box.width + box.height + box.length);
        System.out.println("Коробка со сторонами:");
        System.out.println(box.width + "x" + box.height + "x" + box.length);
        System.out.println("Объем: " + valueOfBox);
    }
}
