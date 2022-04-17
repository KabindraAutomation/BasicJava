package SimpleJavaProg;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("Enter the factorial number that you want to do ");
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		if(n<0) {
			
		
			System.out.println("The entered number should not be non-negative.");
		int fact = 1;
		for (int i = 1; i<=n; i++)
			fact = fact * i; 
		System.out.println("The Factorial of "+n+" is = "+ fact);

	}
	}
}
