package com.chekan.HomeTask;

public class TaskThree {
    public static void main(String[] args) {

        System.out.println ( "Calculate the value of an expression using a formula: ((sinx + cosy) / (cosx - siny)) * tgxy" );

        int x = 15;
        int y = 20;

        double z = (((Math.sin ( x ) + Math.cos ( y )) / (Math.cos ( x ) - Math.sin ( y ))) * Math.tan ( x * y ));
        System.out.println ( "At x = " + x + ", y = " + y + " function value z = " + z );
    }
}
