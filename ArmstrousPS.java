package com.company;

import java.util.Scanner;

public class ArmstrousPS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Limit = ");

        int n=sc.nextInt();
        System.out.println("Armstrous numbers up to "+n);
        for(int i=0;i<n;i++){
        int N = i;
        int temp = N, sum = 0, digit = 0;
        int r = 0;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }
        int t = N;
        while (t != 0) {
            r = t % 10;
            sum = (int) (sum + (Math.pow(r, digit)));
            t = t / 10;
        }

        if (sum == N) {
            System.out.print(sum + ",");
        }
    }
    }
}
