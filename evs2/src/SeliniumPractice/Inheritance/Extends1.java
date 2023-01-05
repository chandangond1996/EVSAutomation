package SeliniumPractice.Inheritance;

public class Extends1 extends Extends2 {

	Extends1(String b) {
		super(10);
		System.out.println("I am constructer of Extends1 class");
	}

	public static void main(String[] args) {

	}

	static {
		System.out.println("I am static of Extends 1");
	}
	@Override
	public int calculater(long salary, long pf) {
		long totalSalary = salary - pf;
		System.out.println(totalSalary);
		return 10;
	}
	public void loop(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println(i);
		}
	}
}
