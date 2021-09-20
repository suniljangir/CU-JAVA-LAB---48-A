package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //TRY - CATCH in EXCEPTION HANDLING
        int[] marks = {97, 98, 95};
//        System.out.println(marks[2]);
        try{
            System.out.println(marks[5]);
        } catch (Exception exception){
            //do things after catching
        }
        System.out.println("The name is Samayra Kapoor");
    }
}