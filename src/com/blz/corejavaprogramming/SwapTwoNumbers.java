package com.blz.corejavaprogramming;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x, y, t; 
	       Scanner SC = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = SC.nextInt();  
	       y = SC.nextInt();  
	      
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       SC.close();
	}

}
