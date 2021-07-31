package com.blz.corejavaprogramming;
import java.util.Scanner;

public class PrimeFactorization {
	
//Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
	
	 public static void main(String[] args) {
		 int number;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a number :");
	      number = sc.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	         sc.close();
	      }
	   }
	}