package com.Bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter the values of val1 and val2: ");
        Scanner qr=new Scanner(System.in);
        System.out.println("val1: ");
        int val1= qr.nextInt();
        System.out.println("val2: ");
        int val2= qr.nextInt();
        int Quotient=0,Remainder=0;
        Quotient =val1/val2;
        Remainder=val1%val2;
        System.out.println("Quotient when"+val1+"/"+val2+"is"+Quotient);
        System.out.println("Remainder when"+val1+"/"+val2+"is"+Remainder);

    }

}
