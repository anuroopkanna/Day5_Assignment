package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicValue {
    public static void main(String[] args) {
        double result =0.0,num=0,j;
        int n;
        Scanner H=new Scanner(System.in);
        System.out.println("Enter the harmonic value : ");
        n=H.nextInt();
        for (j=1;j<=n;j++){
            num=num+((double) 1/j);
            result=num;
        }
        System.out.println("The hormonic no." + n + "is:" +result);
    }
}
