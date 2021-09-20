package com.apnacollege;

import java.util.Arrays;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        //BREAK & CONTINUE
        int i = 0;
        while (true) {
            if(i == 3){
                i = i + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 5){
                break;
            }
        }
    }
}
