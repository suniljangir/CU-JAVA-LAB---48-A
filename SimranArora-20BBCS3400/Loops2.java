package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        //LOOPS
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("input a number");
            number = sc.nextInt();
            System.out.println("here is your number : ");
            System.out.println(number);
        }while (number >= 0);
    }
}
