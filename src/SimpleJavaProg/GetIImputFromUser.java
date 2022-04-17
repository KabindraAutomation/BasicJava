package SimpleJavaProg;

import java.util.Scanner;

public class GetIImputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		//Enter the string and print
		System.out.println("Enter a String");
		String s=in.nextLine();
		System.out.println("You are entered String "+ s);
		
		//Enter the integer and print 
		System.out.println("Enter a a number in integer");
		int a=in.nextInt();
		System.out.println("You are entered String "+ a);
		
		System.out.println("Enter a float");
		float f=in.nextFloat();
		System.out.println("You are entered String "+ f);
				
	}

}
