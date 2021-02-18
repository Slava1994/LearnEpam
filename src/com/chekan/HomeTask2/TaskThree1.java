package com.chekan.HomeTask2;

public class TaskThree1 {
    /**
     *
     * @param args аргументы это координаты точек. В аргументах задаётся шесть координат (три точки).
     */
    public static void main(String[] args) {
        int Аx1 = Integer.parseInt ( args[0] );
        int Аy1 = Integer.parseInt ( args[1] );
        int Bx2 = Integer.parseInt ( args[2] );
        int By2 = Integer.parseInt ( args[3] );
        int Cx3 = Integer.parseInt ( args[4] );
        int Cy3 = Integer.parseInt ( args[5] );

         if ((Cx3 - Аx1) / (Bx2 - Аx1) == (Cy3 - Аy1) / (By2 - Аy1)) {
            System.out.println ( "точки лежат на одной прямой" );
         } else System.out.println ( "точки не лежат на одной пряпой" );
    }
}
// учесть случай, если прямая лежит на осях