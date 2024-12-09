package learn_java;

import java.util.Scanner;

public class Grading_System {

	public static void main(String[] args) {
		// create a scanner class
		Scanner data = new Scanner(System.in);
		System.out.println("     STUDENT RESULT     ");
		System.out.println("");
		
		char YrN = 'y';
		for (; YrN == 'y';) {		
			System.out.print("Student Name : ");
			data.nextLine();
			System.out.println();

			System.out.print("Student Id : ");
			data.nextInt();
			System.out.println();

			System.out.println("  Enter Subjects Marks ");
			System.out.println();

			System.out.print("Tamil     : ");
			int sub_1 = data.nextInt();
			int a = sub_1;
			System.out.print("English   : ");
			int sub_2 = data.nextInt();
			int b = sub_2;
			System.out.print("Maths     : ");
			int sub_3 = data.nextInt();
			int c = sub_3;
			System.out.print("Science   : ");
			int sub_4 = data.nextInt();
			int d = sub_4;
			System.out.print("Social    : ");
			int sub_5 = data.nextInt();
			int e = sub_5;

			if (sub_1 <= 100 && sub_2 <= 100 && sub_3 <= 100 && sub_4 <= 100 && sub_5 <= 100) {
				int total = a + b + c + d + e;
				System.out.println();
				System.out.println("Result: " + total + "/500");
				int percentage = total / 5;
				System.out.println();
				System.out.println("percentage of the result is: " + percentage + "%");
				System.out.println();

				if (sub_1 >= 40 && sub_2 >= 40 && sub_3 >= 40 && sub_4 >= 40 && sub_5 >= 40) {

					if (percentage >= 90 && percentage <= 100) {
						System.out.println("Grade - O");
						System.out.println();
						System.out.println("Grade Point - 10/10");
						System.out.println("");
						System.out.println("Performance - Outstanding");

					} else if (percentage >= 80 && percentage < 90) {
						System.out.println("Grade - A+");
						System.out.println();
						System.out.println("Grade Point - 9/10");
						System.out.println();
						System.out.println("Performance - Excellent");

					} else if (percentage >= 70 && percentage < 80) {
						System.out.println("Grade - A");
						System.out.println();
						System.out.println("Grade Point - 8/10");
						System.out.println();
						System.out.println("Performance - Very Good");

					} else if (percentage >= 60 && percentage < 70) {
						System.out.println("Grade - B+");
						System.out.println();
						System.out.println("Grade Point - 7/10");
						System.out.println();
						System.out.println("Performance - Good");

					} else if (percentage >= 60 && percentage < 70) {
						System.out.println("Grade - B");
						System.out.println();
						System.out.println("Grade Point -6/10");
						System.out.println();
						System.out.println("Performance - Above Average");

					} else if (percentage > 50 && percentage < 60) {
						System.out.println("Grade - C ");
						System.out.println();
						System.out.println("Grade Point - 5/10");
						System.out.println();
						System.out.println("Performance - Average");

					} else if (percentage >= 40 && percentage < 50) {
						System.out.println("Grade - D");
						System.out.println();
						System.out.println("Grade Point - 4/10");
						System.out.println();
						System.out.println("Performance - Pass ");

					}

				} else {
					System.out.println("Grade - F");
					System.out.println();
					System.out.println("Grade Point - 0");
					System.out.println();
					System.out.println("Performance - Fail \n");

				}
				if (sub_1 < 40) {
					System.out.println("You need to improve your Study in Tamil");
				}
				if (sub_2 < 40) {
					System.out.println("You need to improve your Study in English");
				}
				if (sub_3 < 40) {
					System.out.println("You need to improve your Study in Maths");
				}
				if (sub_4 < 40) {
					System.out.println("You need to improve your Study in Science");
				}
				if (sub_5 < 40) {
					System.out.println("You need to improve your Study in Social");
				}

				System.out.println();
				System.out.println("Reset -> press 'y'\n " + "exit -> press 'n'");
				YrN = data.next().charAt(0);
				data.nextLine();
				if (YrN == 'n')

					System.out.println("Thank you\n" + "ALL THE BEST 👍");

			    }  else {
				System.out.println("Given mark are out of range, please enter correctly ");
			}
			data.close();
		}
		
	}
}
