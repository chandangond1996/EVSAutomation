package SeliniumPractice.Inheritance;

public class Extends2 {

	Extends2(int a) {
		System.out.println("I am constructer of Enxtends2 class");
	}

	public static void main(String[] args) {

	}

	static {
		System.out.println("I am static of Extends 2");
	}

	public int calculater(long salary, long pf) {
		long totalSalary = salary - pf;
		System.out.println(totalSalary);
		return 10;
	}

	public void do_while() {
		int x = 1;
		do {

			System.out.println("Hello");
			x++;
		} while (2 < x);
		System.out.println("Thank you..");
	}

}
