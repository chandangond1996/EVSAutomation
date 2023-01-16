package Final_Practice;

public class Parent {

	Parent() {
		System.out.println("I am constructer of Parent_Class");
	}

	public static void main(String[] args) {
		System.out.println("I am main of Parent");

	}

	public void method1() {
		System.out.println("I am non static method 1 Parent ");
	}

	public void OverRide() {
		System.out.println("I am non static method 2 of Parent");
	}

	static {
		System.out.println("I am static block of Parent");
	}
}
