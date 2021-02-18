package com.chekan.M1.UnaryOperators;

public class UnaryOperators {
    public static void main (String[] args) {
        long a = Long.remainderUnsigned(-2,3);
        int b = Integer.remainderUnsigned(-2,3);
        int c = -2%3;
        System.out.print(a + " " + b + " " + c);
    }
}
