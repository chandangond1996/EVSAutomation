package evs2.Code.Scanner;

import java.util.Scanner;

public class MyDatail {

	public static void main(String[] args) {
		String Y_N = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Plese Enter your name.");
			System.out.println("Plese Enter your mobile.");
			System.out.println("Plese Enter your age ");
			System.out.println("Plese Enter your address");System.out.println();
			System.out.println("Please Enter name...");
			String name = sc.next();
			System.out.println("My Name is = " + name);
			System.out.println("Please Enter mobile no.....");
			long mob = sc.nextLong();
			System.out.println("My mobile no. is = " + mob);
			System.out.println("Please Enter age.........");
			int age = sc.nextInt();
			System.out.println("My age is = " + age);
			System.out.println("Please Enter Address....");
			String add = sc.next();
			System.out.println("My Address is = " + add);
			System.out.println("Do you want to another Datail");
			Y_N = sc.next();
		} while (Y_N.contains("Y"));
		System.out.println("Thank you..");

	}
}
