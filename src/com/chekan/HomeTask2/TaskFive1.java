package com.chekan.HomeTask2;

public class TaskFive1 {
    /**
     *
     * @param args аргументы это числа (A<=3 и B>3).
     */
    public static void main(String[] args) {
        int A = Integer.parseInt ( args[0] );
        int B = Integer.parseInt ( args[1] );
        System.out.println ( " Вычислить значение функции Y = ((x*x-3*x+9) / (1/(x*x*x+6)))" );
        System.out.println ( " если x=<3 ; если x>3" );

        double[] x = {A, B};
        double result;
        for(double tmpX : x){
            result = ((tmpX <= 3)) ? (1 / ((tmpX * tmpX * tmpX) + 6)) : (((tmpX * tmpX) - (3 * tmpX)) + 9);
            System.out.println("Y = " + result);
        }
    }
}

