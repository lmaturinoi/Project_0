import java.util.Scanner;
public class GradeScale {

	public static void main (String[]args) {
		Scanner scnr = new Scanner(System.in);
		char letterGrade = ' ';

		System.out.println("What letter grade did you earn in class?");
		letterGrade = scnr.next().charAt(0);
		letterGrade = Character.toUpperCase(letterGrade);

		switch(letterGrade){
			case 'A':
			System.out.println("an A - excellent work!");
			break;

			case 'B':
			System.out.println("you got a B - good job!");
			break;

			case 'C':
			System.out.println("earning a C is satisfactory");
			break;

			case 'D':
			System.out.println("while a D is passing, there is a problem");
			break;

			case 'F':
			System.out.println("an F - you failed the class");
			break;
		}
	}
}

