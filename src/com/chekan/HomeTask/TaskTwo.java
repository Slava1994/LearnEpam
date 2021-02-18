package com.chekan.HomeTask;

public class TaskTwo {
    public static void main(String[] args) {
        //ScannerUtils.scan();
        System.out.println ( "Calculate the value of an expression using a formula" +
                "z =(( b + sqrt ((b * b) + 4 * a * c)) / (2 * a)) - ((a * a * a) * c)) + (1 / b * b))." );

        int a = 3;
        int b = 2;
        int c = 1;

        double z = (b + Math.sqrt ( ((b * b) + 4 * a * c) ) / (2 * a)) - ((a * a * a) * c) + (1 / b * b);
        System.out.println ( "At a = " + a + ", b = " + b + " и c = " + c + " function value z = " + z );
    }
}