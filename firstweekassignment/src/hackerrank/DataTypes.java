package hackerrank;

import java.util.Scanner;

public class DataTypes {
	 
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int ii = scan.nextInt();
		scan.nextLine();
		double dd = scan.nextDouble();
		scan.nextLine();
		String ss = scan.nextLine();

		System.out.println(i + ii);
		System.out.println(d + dd);
		System.out.println(s + ss);
		
		scan.close();
	}
}
