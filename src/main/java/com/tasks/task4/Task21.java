package com.tasks.task4;

/**
 * Задача 90:
 * Программа разбивает строку на массив строк,
 * разделителем между элементами массива является пробел,
 * затем выводит каждый элемент массива и выводит строку в обратном порядке.
 */
public class Task21 {

    public static void main(String[] args) {
        String string = "папа дома мама дома сын дома дочь дома";
        System.out.println(string);
        String[] arr = string.split(" ");
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.println(" arr[ " + i + " ] = " + arr[i]);
        }
        for (int i = (l - 1); i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
