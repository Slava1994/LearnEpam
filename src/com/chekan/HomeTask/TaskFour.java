package com.chekan.HomeTask;

public class TaskFour {
    public static void main(String[] args) {

        double x = 111.999;
        double n = ( int ) x;
        double result = n / 1000 + (x - n) * 1000;
        System.out.printf ( "Value with 3 digits after decimal point %.3f %n", result );
    }
}
