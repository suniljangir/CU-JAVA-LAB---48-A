package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchStatementt {

    public static void main(String[] args) {
        //conditional statements - SWITCH
        int day = 2; // 1- monday; 2- tuesday
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}