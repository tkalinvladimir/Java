package com.javarush.test.level03.lesson04.task02;

/* 4 скобки
Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
*/

import java.util.Scanner;

/*
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.print(a*a);

    }
}