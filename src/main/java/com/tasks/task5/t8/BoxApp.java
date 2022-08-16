package com.tasks.task5.t8;

/**
 * Задача 98:
 * Программа выводит цвет прямоугольника и его периметр,
 * стороны формируются случайным образом, цвет задан.
 */
public class BoxApp {

    public static void main(String[] args) {
        int side1W = (int)(Math.random() * 100) + 1;
        int side1H = (int)(Math.random() * 100) + 1;
        int side2W = (int)(Math.random() * 100) + 1;
        int side2H = (int)(Math.random() * 100) + 1;

        Box box1 = new Box();
        box1.width = side1W;
        box1.height = side1H;
        box1.color = "Крассный";

        Box box2 = new Box();
        box2.width = side2W;
        box2.height = side2H;
        box2.color = "Синий";

        int perimeter = (box1.width + box1.height) * 2;
        System.out.println("Прямоугольник " + box1.color);
        System.out.println("стороны " + box1.width + " и " + box1.height);
        System.out.println("периметр " + perimeter);

        perimeter = (box2.width + box2.height) * 2;
        System.out.println("Прямоугольник " + box2.color);
        System.out.println("стороны " + box2.width + " и " + box2.height);
        System.out.println("периметр " + perimeter);
    }
}
