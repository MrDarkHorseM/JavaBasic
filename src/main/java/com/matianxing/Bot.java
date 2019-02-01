package com.matianxing;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args){
        System.out.println("Please say something.");
        Scanner s = new Scanner(System.in);
        String t = s.next();
        String m = null;

        switch(t){
            case "Hi":
                m = "How are you";
                break;
            case "Fine":
                m = "Thank you";
                break;
            case "weather?":
                m = "76F";
                break;
        }
        System.out.println(m);

    }
}
