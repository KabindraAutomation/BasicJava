package SimpleJavaProg;

import java.util.Scanner;

public class swapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y , temp;
		 System.out.println("Enter x and y");
		 Scanner in = new Scanner(System.in);
		 x = in.nextInt();
		 y = in.nextInt();
		 
		 System.out.println("Before swap value of x = "+x+ " value of Y = " + y);
		  temp = x;
		  x= y;
		  y= temp; 
		  System.out.println("After swap value of x = "+x+ " value of Y = " + y); 

	}

}
