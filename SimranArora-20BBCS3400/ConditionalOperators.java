package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionalOperators {

    public static void main(String[] args) {
        //conditional statements
        Scanner sc = new Scanner(System.in);
        //pen = 10; notebook = 40

        System.out.println("enter the cash amount you are having");
        int cash = sc.nextInt();
        if(cash<10){
            System.out.println("cannot buy anything");
            System.out.println("get more cash");
        }
        else if(cash > 10 && cash < 40){
            System.out.println("can get 1 thing");
        }
        else{
            System.out.println("can get both");
        }
    }
}