package com.tasks.task5.t13;

import java.util.Scanner;

public class Box {

    int width;
    int height;
    int length;

    public void valueOfBox() {
        System.out.println("Объем: " + (width * height * length));
    }

    public void lengthOfSides() {
        System.out.println("Длина сторон: " + (width + height + length) * 4);
    }

    public void inputSides() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер коробки");
        System.out.print("Введите ширину:");
        width = sc.nextInt();
        System.out.print("Введите высоту:");
        height = sc.nextInt();
        System.out.print("Введите глубину:");
        length = sc.nextInt();
        sc.close();

        System.out.println("Ширина: " + width + ", вывоста: " + height + ", глубина: " + length);
    }
}
