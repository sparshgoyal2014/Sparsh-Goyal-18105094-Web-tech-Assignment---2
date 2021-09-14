package com.company;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str1 :");
        String str1 = scanner.nextLine();
        System.out.println("Enter str2 :");
        String str2 = scanner.nextLine();

        boolean str1isSmall = true;
        int i=0;

        while(i < str1.length() && i < str2.length()){
            if(str1.charAt(i) < str2.charAt(i)){
                str1isSmall = true;
                break;
            }else if(str1.charAt(i) > str2.charAt(i)){
                str1isSmall = false;
                break;
            }
            i++;
        }

        if(str1isSmall == true){
            System.out.println("Str1 is lexicographically small");
        }else{
            System.out.println("str2 is lexicographically small");
        }





    }
}
