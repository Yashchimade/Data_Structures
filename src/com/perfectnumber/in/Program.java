package com.perfectnumber.in;

import java.util.Scanner;

public class Program {

	static int isPerfectNum(int num, int fact, int sum) {
		if (fact >= num) {
			return sum;
		}

		else {
			if (num % fact == 0) {
				sum = sum + fact;
			}
		}
		return isPerfectNum(num, fact + 1, sum);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int fact = 1;
		int sum = 0;
		int perfNum = isPerfectNum(num, fact, sum);

		if (num == perfNum)
			System.out.println("Perfect number");
		else
			System.out.println("Not Perfect number");
		
		sc.close();

	}
}