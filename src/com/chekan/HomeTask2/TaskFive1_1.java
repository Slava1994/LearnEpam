package com.chekan.HomeTask2;

public class TaskFive1_1 {
    /**
     * @param args аргумент это x.
     */
    public static void main(String[] args) {
        int x = Integer.parseInt ( args[0] );
        System.out.println ( " Вычислить значение функции Y = ((x*x-3*x+9) : (1/(x*x*x+6)))" );
        System.out.println ( " если x <= 3 ; если x > 3" );

        double y;
        int i=3;

        if (x <= i) {
            y = (x * x - 3 * x + 9);
            System.out.println ( "При x <= 3 Y = " + y );
            }
        else {
            y = (1 / (x * x * x + 6));
            System.out.println ( "При x > 3 Y = " + y );
        }
    }
}


