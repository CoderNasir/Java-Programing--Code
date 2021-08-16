package com.company;
 
import java.util.Scanner;

public class UtoLPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        StringBuffer newstr=new StringBuffer(str);
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                newstr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                newstr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println("Your New String U to L  and L to U Case");
        System.out.println(newstr);
    }
}
