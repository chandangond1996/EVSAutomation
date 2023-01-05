package SeliniumPractice.Polymorphism;

public class OverLodingMethod {

	public static void main(String[] args) {
		OverLodingMethod obj = new OverLodingMethod();
		obj.method(100000);
		obj.method("chandan");
		obj.method(null, 20);
	}

	public void method(long a) {
		System.out.println("This is method 1");
	}

	public void method(int a) {
		System.out.println("This is method 2");
	}

	public void method(String a, int b) {
		System.out.println("This is method 3");
	}

	public void method(String a) {
		System.out.println("This is method 4");
	}

}
