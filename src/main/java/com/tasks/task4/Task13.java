package com.tasks.task4;

import java.util.Scanner;

/**
 * Задача 82:
 * Пользователь вводит фамилию, имя, отчество.
 * Программа выводит инициалы и фамилию.
 */
public class Task13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, patronymic;
        System.out.print("Введите фамилию:");
        firstName = sc.nextLine();
        System.out.print("Введите имя:");
        lastName = sc.nextLine();
        System.out.print("Введите отчество:");
        patronymic = sc.nextLine();
        sc.close();

        char fCh = lastName.charAt(0);
        String firstLetter = "" + fCh + ".";
        char sCh = patronymic.charAt(0);
        String secondLetter = "" + sCh + ".";
        System.out.println(firstLetter + secondLetter + "" + firstName);

    }
}
