package com.primefactor.in;


import java.util.Scanner;

public class Program {

   public static int primeFactors(int n){
	   int i = 2;
       while (i <= n) {
           if (n % i == 0) {
               System.out.print(i + " ");
               n = n / i;
           } else {
               i++;
           }
       }
	return i;
   }
	
	

   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Give me a number : ");
       int n = sc.nextInt();
       primeFactors(n);
       sc.close();
   }
}
