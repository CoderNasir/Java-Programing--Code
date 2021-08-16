package com.company;

import java.util.Scanner;

public class RightRotatePS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int T=sc.nextInt();
        System.out.print("Origanal Array = ");
        for(int E:arr){
            System.out.print(E+" ");
        }
        for(int j=0;j<T;j++) {
            int last=arr[arr.length-1];

            for (int i = arr.length-1; i >0; i--) {
                    arr[i]=arr[i-1];
            }

            arr[0]=last;
        }

        System.out.println(" ");
        System.out.print("Rotating  Array = ");
        for(int E:arr){
            System.out.print(E+" ");
        }
    }
}
