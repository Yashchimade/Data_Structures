package com.amicable.no;

import java.util.Scanner;

public class Program {
	
	private static boolean isAmicable(int num1, int num2) {
        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);
        if (sum1 == num2 && sum2 == num1 && num1 != num2) {
            return true;
        }
        return false;
    }

    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        boolean isAmicable = isAmicable(num1, num2);
        if (isAmicable) {
            System.out.println("The given numbers are Amicable Numbers.");
        } else {
            System.out.println("The given numbers are not Amicable Numbers.");
        }
    }

    
}
