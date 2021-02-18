package com.chekan.HomeTask2;

public class TaskFour1 {
    public static void main(String[] args) {
        /**
         *
         * @param args аргументы это размеры отверстия и кирпича. В аргументах задаются два размера для отверстия (A и B) и три размера для кирпича (x,y,z).
         */
        int А = Integer.parseInt ( args[0] );
        int B = Integer.parseInt ( args[1] );

        int x = Integer.parseInt ( args[2] );
        int y = Integer.parseInt ( args[3] );
        int z = Integer.parseInt ( args[4] );

        if (x <= А && y <= B || y <= А && x <= B || x <= А && z <= B || z <= А && x <= B || z <= А && y <= B || y <= А && z <= B)
            System.out.println ( "кирпич пройдёт в отверстие" );
        else System.out.println ( "кирпич не пройдёт в отверстие" );
    }
}
