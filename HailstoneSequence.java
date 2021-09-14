package com.company;

import java.util.Scanner;

public class HailstoneSequence {

    public static void hailstone(int n){

        System.out.println("Hailstone sequence is: ");

        while(n != 1){
            System.out.print(n + " ");
            if(n % 2 == 0){
                n = n/2;
            }else{
                n = n*3 + 1;
            }
        }

        System.out.println(1);



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to print its Hailstone Sequence : ");
        int number = scanner.nextInt();

        hailstone(number);

    }
}
