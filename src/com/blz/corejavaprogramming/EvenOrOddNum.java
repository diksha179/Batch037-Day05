package com.blz.corejavaprogramming;

import java.util.Scanner;

public class EvenOrOddNum {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");		
		int numb = SC.nextInt();
	
		if(numb  %  2 == 0)								
			System.out.println("Even Number");
		
		else											
			System.out.println("Odd Number");
		SC.close();									
	}
	}

