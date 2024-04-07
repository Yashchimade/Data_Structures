package com.armstrongno.in;

import java.util.Scanner; 
import java.lang.Math; 

public class Program {
    
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int originalNumber = number;
        
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        
        return sum == originalNumber;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 3-digit number: ");
        int inputNumber = scanner.nextInt();
        
        if (inputNumber >= 100 && inputNumber <= 999) {
            if (isArmstrong(inputNumber)) {
                System.out.println(inputNumber + " is an Armstrong number.");
            } else {
                System.out.println(inputNumber + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
        
        scanner.close();
    }
}