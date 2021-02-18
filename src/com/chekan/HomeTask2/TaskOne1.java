package com.chekan.HomeTask2;

public class TaskOne1 {
    /**
     *
     * @param args аргументы это углы, которые задаются для треугольника. В аргументах задаётся два угла.
     */
    public static void main(String[] args) {
        int x = Integer.parseInt ( args[0] );
        int y = Integer.parseInt ( args[1] );
        int z = 180 - (x + y);

        if (z < 0) {
            System.out.println ( "Углы не соответсвтуют треугольнику" );
            return;
        }

        if (x + y >= z) {
            System.out.println ( "треугольник существует" );
            if (x == 90 || y == 90 || z == 90) {
                System.out.println ( "треугольник прямоугольный" );
            }
        } else {
            System.out.println ( "треугольник не существует" );
        }
    }
}

