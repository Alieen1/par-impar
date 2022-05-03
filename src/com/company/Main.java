package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if (number%2==0)
        System.out.println("Numarul este par");
        else
            System.out.println(" Numarul este impar");


    }
}
