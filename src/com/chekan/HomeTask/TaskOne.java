package com.chekan.HomeTask;

import utilities.ScannerUtils;

public class TaskOne {
    public static void main (String[] args ) {
        System.out.println ( "Find the value of the function:  z = ( (a – 3 ) * b / 2) + c." );

        double a = ScannerUtils.scan ( );
        double b = ScannerUtils.scan ( );
        double c = ScannerUtils.scan ( );

        double z = ((a - 3.0) * b / 2.0) + c;
        System.out.println ( "At a = " + a + ", b = " + b + " и c = " + c + " function value z = " + z );

        System.out.println ( );
    }
}
