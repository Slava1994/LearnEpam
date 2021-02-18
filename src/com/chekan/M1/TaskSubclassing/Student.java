package com.chekan.M1.TaskSubclassing;

class Student extends Person {
    int i = 2;

    public void method( ) {
        System.out.println ( super.i + " " + this.i );
    }
}