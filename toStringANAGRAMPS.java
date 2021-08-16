package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class toStringANAGRAMPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String srt1=sc.nextLine();

        String srt2=sc.nextLine();
        srt1= srt1.toLowerCase();
        srt2=srt2.toLowerCase();

        if(srt1.length()!=srt2.length()){
            System.out.println("Both String Are Not A Anagrame");
        }
        else{
            char [] A=srt1.toCharArray();
            char [] B=srt2.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);

            if(Arrays.equals(A,B)){
                System.out.println("Both String Are A Anagrame");
            }
            else{
                System.out.println("Both String Are Not a Anagrame");
            }
        }
    }
}
