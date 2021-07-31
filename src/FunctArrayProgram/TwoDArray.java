package FunctArrayProgram;
import java.util.Scanner;

public class TwoDArray {
	
//Logic -> create 2 dimensional array in memory to read in M rows and N column
	public static void main(String args[])
	   {
		   
	       int row, col, i, j;
	      
	       Scanner scan = new Scanner(System.in);
		   
	       
	       System.out.print("Enter the number of rows: ");
	       row = scan.nextInt();
	       System.out.print("Enter the number of columns : ");
	       col = scan.nextInt();
	       int array[][] = new int[row][col];
	       System.out.println("Enter the elements of the array: ");
		   
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               array[i][j] = scan.nextInt();
	           }
	       }
		   
	       System.out.print("The Array is :\n");
	       for(i=0; i<row; i++)
	       {
	           for(j=0; j<col; j++)
	           {
	               System.out.print(array[i][j]+ "  ");
	           }
	           System.out.println();
	       }
	   }
	}		