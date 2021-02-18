package com.chekan.M1.Arithmetic;

public class TypeConverterExample {
    public static void main (String[] args) {
            int a = 129;
            byte b = 3;
            Object ab = (byte) a + b;
            System.out.println(ab.getClass().getName() + " value: " + ab);
        }
    }
