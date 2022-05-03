package com.pluralsight.calcengine;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double fact=1;

        while(n>1)
        {
            fact *= n;
            n--;
        }
        System.out.println("The factorial of a Number is "+fact);

        do {
            System.out.print("Number = "+n);
            System.out.print(" * 2 =");
            n *= 2;
            System.out.println(n);
        } while(n< fact);
    }
}
