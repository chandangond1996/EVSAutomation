package evs2.Code.Scanner;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		String color;
		String n = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Signal of trafic light...");
			color = sc.next();
			if (color.contains("red")) {
				System.out.println("You are not allow to go Red signal...");
			} else if (color.contains("yellow")) {
				System.out.println("Get ready to go yellow signal....");
				color = sc.nextLine();
			} else if (color.contains("green")) {
				System.out.println("You are allow to go as green light.....");
			}else 
				System.out.println("Wrong Detail..........");
			System.out.println("Do you want to check signal after 10 minute");
			n = sc.next();
		} while (n.contains("yes"));
		System.out.println("Thank you");
	}

}
