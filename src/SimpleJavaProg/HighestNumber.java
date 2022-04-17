package SimpleJavaProg;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WAP to findout the highest number amound the three number
		/*int a = 1;
		int b = 4; 
		int c = 6;*/
		int a,b,c;
		System.out.println("Enter three value");
		Scanner in = new Scanner(System.in);
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		
		if(a>b && a>c) 
			System.out.println("A is the highest number");
		else if (b>a && b>c)
		System.out.println("B is the highest numbner");
		else
			System.out.println("C is the highest number");
		
	}

}
