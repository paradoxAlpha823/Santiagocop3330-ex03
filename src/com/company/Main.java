/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        System.out.print("What is the quote?");
        String s1 = x.nextLine();
        System.out.print("Who said it?");
        String s2 = y.nextLine();
        System.out.println(s2 + " says, \"" + s1 + "\"");
    }
}

