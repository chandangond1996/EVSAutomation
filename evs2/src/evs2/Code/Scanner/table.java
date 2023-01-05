package evs2.Code.Scanner;

import java.util.Scanner;

public class table {

	public static void tablePrint(int table) {
		for (int x = 1; x <= 10; x++) {
			System.out.println(table + "X" + x + "=" + table * x);
		}

	}

	public static void main(String[] args) {
		int table;
		String Y_N;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please Enter a Number to print a table ");
			table = sc.nextInt();
			tablePrint(table);
			System.out.println("Do you want to print another table? (Y/N)");
			Y_N = sc.next();
		} while (Y_N.contains("Y"));
		System.out.println("Thank You.......");
	}
}