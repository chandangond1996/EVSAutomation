package evs2.Code.Scanner;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		//dl(); // calling method 2.....
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your age for voting....");
		int year = sc.nextInt();
		int age = 2022 - year;
		if (age < 18) {
			System.out.println("You are minor...");
		} else if (age >= 18 && age < 60) {
			System.out.println("You are Elleigeble for voting....");
		} else {
			System.out.println("Sorry.....You are senior citizen....");
		}
	}

	public static void dl() { /// this is a method 2.....
		String Y_N = "";
		Scanner sc1 = new Scanner(System.in);
		int year;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Please Enter your age for dl......");
			
			if (sc.hasNextInt()) {
				year = sc.nextInt();
				int age = 2022 - year;
				if (age < 18) {
					System.out.println("You are minor candidate...");
				} else if (age >= 18 && age < 60) {
					System.out.println("You are Elleigeble for DL...");
				} else {
					System.out.println("Sorry.. You are Senior Citizen...");
				}
			} else
				System.out.println("you have enter invalid character !!");
			
			System.out.println("Do you want to check another...");
			Y_N = sc1.next();
		} while (Y_N.contains("Y"));
		System.out.println("Thank You bye bye.....");
	}

}
