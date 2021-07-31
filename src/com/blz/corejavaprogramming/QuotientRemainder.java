package com.blz.corejavaprogramming;
import java.util.Scanner;
public class QuotientRemainder {

	public static void main(String[] args) {
		
		Scanner SC =new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=SC.nextInt();
        System.out.println("Enter the second number: ");
        int num2=SC.nextInt();  
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The quotient is: " + quotient);
        
        System.out.println("The remainder is: " + remainder);
        SC.close();
    }
	}


