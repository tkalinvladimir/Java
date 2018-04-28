package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution n = new Solution();
        n.innerClasses[0] = n.new InnerClass();
        n.innerClasses[1] = n.new InnerClass();
        Solution n2 = new Solution();
        n2.innerClasses[0] = n2.new InnerClass();
        n2.innerClasses[1] = n2.new InnerClass();

        Solution[] res = new Solution[2];
        res[0] = n;
        res[1] = n2;
        return res;
    }

    public static void main(String[] args) {


    }
}
