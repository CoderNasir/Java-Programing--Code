package com.company;

import java.util.Scanner;

public class SubSetOFStringPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        int L=A.length() , temp=0;
        int SL=L*(L+1)/2 ;
        String[] SS=new String[SL];
        for (int i=0;i<L;i++){
            for (int j=i;j<L;j++){
                SS[temp]=A.substring(i,j+1);
                temp++;
            }
        }

        System.out.println("Subset Of String ==");

        for(int i=0;i<SL;i++){
            System.out.println(SS[i]);
        }

    }
}
