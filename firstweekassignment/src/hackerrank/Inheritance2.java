package hackerrank;

public class Inheritance2 {
	public static void main(String[] args) {
		// Create a new Adder object
		Adder a = new Adder();

		// Print the name of the superclass on a new line
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

		
		System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");
	}
}
