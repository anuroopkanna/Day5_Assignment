package com.Bridgelabz;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int x,y,t;// x and y are to swap
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the value of X and Y: ");
        x= S.nextInt();
        y=S. nextInt();
        System.out.println("Before swapping numbers"+x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping:"+x+" "+y);
        System.out.println();
    }
}
