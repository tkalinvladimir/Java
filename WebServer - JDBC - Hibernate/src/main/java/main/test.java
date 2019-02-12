package main;

public class test {
    public static void main(String[] args) {
        int a = 1;
        int incr = 4;
        Incrementer incrementer = (x,y) -> x+y;
        System.out.println(incrementer.increment(a,incr));

    }
}
