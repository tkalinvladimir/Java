package com.javarush.task.test;

public class Test123 {
    public static String reverse(String s) {
        StringBuilder res = new StringBuilder(s);
        return res.reverse().toString();
    }

    public int calA(int a, int b){
        return a*b;
    }
}
