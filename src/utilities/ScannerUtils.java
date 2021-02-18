package utilities;

import java.util.Scanner;

public class ScannerUtils {
    public static double scan( ) {

        Scanner x = new Scanner ( System.in );  // Create a Scanner object
        System.out.println ( "Enter number " );

        String numberString = x.next ( );  // Read user input
        double number = Double.parseDouble ( numberString );
        System.out.println ( "Number is: " + number );  // Output user input
        return number;
    }
}





