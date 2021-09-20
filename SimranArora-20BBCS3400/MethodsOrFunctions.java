package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsOrFunctions {
    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printSum(int a, int b ) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //METHODS
//        System.out.println("Hello Java");
        printJava();
        printName("Simran");
        printName("Samayra");
        printSum(1, 6);
    }
}