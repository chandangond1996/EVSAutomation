package ThisSuper;

import Final_Practice.Parent;

public class ChildClass extends ParentClass {
	 static ParentClass obj = new ChildClass();
	public ChildClass() {
		System.out.println(obj);
		System.out.println("I am constructer of Child Class");
	}
	public ChildClass(int a) {
		super(10);
	}

	int b=1;

	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		ChildClass obj2 = new ChildClass(4);
//		obj2.setValue(10);
	}

	public void setValue(int c) {

		System.out.println(super.b);
		System.out.println(this.b);
	}

	public void run() {
		System.out.println(b);

	}

	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");
	}
}
