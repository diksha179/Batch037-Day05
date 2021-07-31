package com.blz.corejavaprogramming;
import java.util.Scanner;

public class LeapYearProgm {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);

	    System.out.print("Enter a year:");
	    int year = Integer.valueOf(SC.nextInt());

	       if (year % 400 == 0 || (year % 4 ==0) && (year %100 != 0)) {
	    	   
	        System.out.println("Leap year");
	        }
	     else {
	        System.out.println("Not leap year");
	        SC.close();
	    }
	}

}
