package com.blz.corejavaprogramming;

import java.util.Scanner;

public class LargAmgThreeNo {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = SC.nextInt();
		System.out.println("Enter the value of y");
		int y = SC.nextInt();
		System.out.println("Enter the value of z");
		int z = SC.nextInt();
		int result = 0;
		if (x >= y && x >= z) 
			result = x;
		 else if (y >= x && y >= z) 
			result = y;
		 else 
			result = z;
		
		System.out.print("result is:" +result);
	    SC.close();
	}
	

}
