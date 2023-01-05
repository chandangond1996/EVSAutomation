package RinkuSir.Switch_Case;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		String key, Y_N;
		do {
			System.out.println("Please Enter the no...");
			Scanner sc = new Scanner(System.in);
			key = sc.next();
			if (key.equalsIgnoreCase("plus")) {
				add(10, 5);
			} else if (key.equalsIgnoreCase("min")) {
				minus(50, 20);
			} else if (key.equalsIgnoreCase("mult")) {
				multiply(5, 2);
			} else if (key.equalsIgnoreCase("devi")) {
				devide(50, 5);
			} else
				System.out.println("No match symble");
			System.out.println("Do you want again check calculator");
			Y_N = sc.next();
		} while (Y_N.equalsIgnoreCase("yes"));
		System.out.println("Thank you....");
	}

	public static void add(double x, double y) {
		System.out.println(x + y);
	}

	public static void minus(double x, double y) {
		System.out.println(x - y);
	}

	public static void multiply(double x, double y) {
		System.out.println(x * y);
	}

	public static void devide(double x, double y) {
		System.out.println(x / y);
	}

}
