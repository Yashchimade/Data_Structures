package com.gcd.in;

import java.util.Scanner;

public class Program {

	public static int calcGcd(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		} else {
			return calcGcd(num2, num1 % num2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int num2 = sc.nextInt();

		int num3 = calcGcd(num1, num2);
		sc.close();

		System.out.println("Greatest common devisor of " + num1 + " and " + num2 + " is : " + num3);
	}
}