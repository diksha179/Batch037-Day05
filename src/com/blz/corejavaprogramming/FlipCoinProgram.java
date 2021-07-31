package com.blz.corejavaprogramming;
import java.util.Scanner;

//Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads


public class FlipCoinProgram {

	public static void main(String[] args)
    {
        int head = 0, tail = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner SC = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = SC.nextInt();
         
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < 0.5)
            {
                head++;
                System.out.println("\t heads");
            }
            else
            {
                tail++;
                System.out.println("\t tails");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("Number of Heads = " + head);
        System.out.println("Number of Tails = " + tail);
         SC.close();
         
         
    }
}
