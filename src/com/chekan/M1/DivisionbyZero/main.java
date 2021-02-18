package com.chekan.M1.DivisionbyZero;

public class main {
    public static void main (String[] args) {
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        b =  3.0 / 0;
        c = 0 / 4.0;
        d = 0 / 0.0;
        sum = a + b + c + d;
        sumBC = b + c;
        comAB = a * b;
        System.out.print(sum + " " + sumBC + " " + comAB);
    }
}
