package RinkuSir.Switch_Case;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		String symble, Y_N;
		double num1, num2, result;
		do {
			System.out.println("Please Enter the no....");
			Scanner sc = new Scanner(System.in);
			num1 = sc.nextInt();
			symble = sc.next();
			num2 = sc.nextInt();
			switch (symble) {
			case "+": {
				result = num1 + num2; System.out.println(result);
				break;
			}
			case "-": {
				result = num1 - num2;  System.out.println(result);
				break;
			}
			case "*": {
				result = num1 * num2;  System.out.println(result);
				break;
			}
			case "/": {
				result = num1 / num2;  System.out.println(result);
				break;
			}
			default:
				System.out.println("NO match symble");
				break;
			}
			System.out.println("Do you want check another no...");
			Y_N = sc.next();
		} while (Y_N.equalsIgnoreCase("yes"));
		System.out.println("Thank you.....");
	}

}
