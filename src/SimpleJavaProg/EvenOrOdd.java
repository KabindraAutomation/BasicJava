package SimpleJavaProg;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to find the even or odd number: if a number is divisible by two then number is even otherwise odd
		System.out.println("Enter any number = ");
		Scanner in = new Scanner(System.in);
		int x= in.nextInt(); 
		if(x % 2 == 0)
			System.out.println("You have enterd Even number "+ x);
		else
			System.out.println("You have enterd Odd Number " + x);
				
	}

}
