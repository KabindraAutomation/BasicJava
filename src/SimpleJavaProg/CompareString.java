package SimpleJavaProg;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string ");
		s1= in.next(); 
		System.out.println("Enter the second string ");
		s2= in.next();
		if(s1.compareTo(s2)>0)
			System.out.println("First is greater than second ");
		else if (s1.compareTo(s2)<0)
			System.out.println("First string is smaller than second ");
		else
			System.out.println("Both string are equal");

	}

}
