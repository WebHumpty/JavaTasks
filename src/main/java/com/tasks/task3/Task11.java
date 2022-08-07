package com.tasks.task3;

/**
 * Задача 49: Программа создает массив из 10 элементов,
 * заполняет его случайным образом, а потом меняет
 * у первых пяти символов массива знак
 * на противоположный и выдаёт новый массив с новой строки
 */
public class Task11 {

    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * 10 + 1);
            if (i < 5) {
                a[i] = -a[i];
            }
            System.out.print(a[i]);
            if (i == (n - 1)) {
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
    }
}
