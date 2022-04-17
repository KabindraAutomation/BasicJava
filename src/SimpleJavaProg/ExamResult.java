package SimpleJavaProg;

import java.util.Scanner;

public class ExamResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * MarkObtani > 90% - Gread A MarkObtani > 75% - Gread B MarkObtani > 60% -
		 * Gread C MarkObtani <60% - Gread D
		 * 
		 */
		int MarkObt;
		int PassMark = 40;
		char grade;
		System.out.println("Enter the the obtained mark in exam = ");
		Scanner in = new Scanner(System.in);
		MarkObt = in.nextInt();
		if (MarkObt >= PassMark) {
			if (MarkObt > 90)
				grade = 'A';
			else if (MarkObt > 75)
				grade = 'B';
			else if (MarkObt > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exa,m  and your grade is = " + grade);
		}
		else

		{
			grade = 'F';
			System.out.println("You are failed "+ grade);


	}
	}

}
