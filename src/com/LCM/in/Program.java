package com.LCM.in;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the first number : ");
		int num2 = sc.nextInt();
	
		int n1 = num1;
		int m1 = num2;
		while( m1 != n1 ){
		    if( m1 > n1 )
		        n1 += num1;
		    else 
		        m1 += num2;
		}
		sc.close();
		System.out.println( "LCM of "+num1+" and "+num2+" is " + m1 );

	}

}
