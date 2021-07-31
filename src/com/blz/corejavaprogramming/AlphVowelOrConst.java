package com.blz.corejavaprogramming;

import java.util.Scanner;

public class AlphVowelOrConst {

	public static void main(String[] args) {
		
		 System.out.println("Enter a character :");
	      Scanner SC = new Scanner(System.in);
	      char ch = SC.next().charAt(0);
	      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
	         System.out.println("Given character is an vowel");
	      }else{
	         System.out.println("Given character is a consonant");
	         SC.close();
	}
	     

	}
}