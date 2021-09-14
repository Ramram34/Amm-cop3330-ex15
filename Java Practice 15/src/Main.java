/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the 5 digit password:");
        int password = in.nextInt() ;


        if (password == 12345) {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Denied!");
        }


    }
}
