package com.chekan.HomeTask;

public class TaskSix {
    public static void main(String[] args) {
        int x = 0;
        int y = -1;

        System.out.println ( "Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае" );

        if (((y >= 0) && (y <= 4) && (x >= -2) && (x <= 2)) || ((y >= -3) && (y <= 0) && (x >= -4) && (x <= 4))) {
            System.out.print ( "True: " );
        } else {
            System.out.print ( "False: " );
        }

        System.out.println ( "Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области" );
    }
}
