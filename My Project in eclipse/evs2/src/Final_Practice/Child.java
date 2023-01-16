package Final_Practice;

public class Child extends Parent {
	Child(int a) {
		System.out.println("I am construter of Child_Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main of Child");
	}

	public void method1(int a) {
		System.out.println("I am non static method 1 Child ");
	}

	@Override
	final public void OverRide() {
		System.out.println("I am non static Override method  of Child");
	}

	static {
		System.out.println("i am static of Child");
	}
}
