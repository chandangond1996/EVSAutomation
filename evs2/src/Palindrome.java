import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
//		method();
		int num = 9211;
//		int sum = 0;
		while (num > 0) {
			int rev = num % 10;
//			sum = sum + rev;
			num = num / 10;
			System.out.print(rev);
		}
	}

	public static void Pndrome() {
		int r;
		int num = 12321;
		int sum = 0;
		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;

		}
//		if (r == 1) {
//			System.out.println("This is a Palindrome...");
//		}
	}

	public static void method() {
		String Y_N = "";
		System.out.println("Please Enter year....");
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		do {
			if (year % 4 == 0) {
				System.out.println("Lip year");
			} else
				System.out.println("Not Lip year");
			System.out.println("Do you want check another nomber...");

			Y_N = sc.next();
		} while (Y_N.equalsIgnoreCase("yes"));
		System.out.println("Thanku bye bye .....");
	}

}
