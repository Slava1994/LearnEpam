package com.chekan.HomeTask2;

public class TaskTwo1 {
    /**
     * Функция которая ищет значение max{min(a, b), min(c, d)}
     *
     * @param args аргументы это значения, задаваемые извне. В аргументах содержится четыре числа.
     */
    public static void main(String args[]) {
        int a = Integer.parseInt ( args[0] );
        int b = Integer.parseInt ( args[1] );
        int c = Integer.parseInt ( args[2] );
        int d = Integer.parseInt ( args[3] );

        System.out.println ( "Найти max{min(a, b), min(c, d)}" );

        System.out.println ( "максимальное значение из минимальных" );
        System.out.println ( Math.max ( Math.min ( a, b ), Math.min ( c, d ) ) );
    }
}
