package hackerrank;

import java.util.Scanner;

public class JavaAbstractClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
		sc.close();

	}

}
