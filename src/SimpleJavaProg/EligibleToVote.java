package SimpleJavaProg;

import java.util.Scanner;

public class EligibleToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Etner the aqe of votter ");
		Scanner in = new Scanner(System.in);
		age= in.nextInt();
		if (age>=18)
			System.out.println("Voter is eligible to vote");
		else
			System.out.println("Try next time");
		

	}

}
