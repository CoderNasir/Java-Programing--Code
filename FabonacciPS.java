package com.company;

import java.util.Scanner;

public class FabonacciPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your N ");
        int N=sc.nextInt();
        int a=0 , b=1;
        System.out.print(a+" "+b);
        for(int i=1;i<N;i++){
            int F=a+b;
            System.out.print(" " +F);
            a=b;
            b=F;
        }
    }
}
