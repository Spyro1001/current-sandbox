package org.example.sandbox.algorithms;

public class Algorithm {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int factorial(int a) {
        int fact = 1;
        for(int x = 1; x <= a; x++) {
            fact *= x;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
