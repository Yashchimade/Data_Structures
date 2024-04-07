package com.automorphic.in;

import java.util.Scanner;

public class Program {
	
	private static void Automorphic(int a) {
		
        if ((a % 10) == (((int) Math.pow(a, 2)) % 10)) {
            System.out.println(" It is Automorphic number");
        } else {
            System.out.println(" It is not a Automorphic number");
        }
        
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        Automorphic(a);
        sc.close();
    }    
}