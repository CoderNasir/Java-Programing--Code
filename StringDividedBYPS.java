package com.company;

import java.util.Scanner;

public class StringDividedBYPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        System.out.println("Enter Your Divided Part Of Number ==");
        int N=sc.nextInt();
        int temp=0,chars=A.length()/N ;
        String[] equalStr = new String [N];
        if(A.length()%N!=0){
            System.out.println("This String Cannot be Divided By N Number of Parts");
        }
        else{
            for(int i=0;i<A.length();i=i+chars){
                String part = A.substring(i, i+chars);
                equalStr[temp]=part ;
                temp++;
            }
            System.out.println(N + " equal parts of given string are ");

            for(int i=0;i< equalStr.length ;i++){
                System.out.println(equalStr[i]);
            }

        }
    }
}
