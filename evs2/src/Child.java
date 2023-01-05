
public class Child extends Parent {

	public static void main(String[] args) {

		final int a = 10;

	}

	public void method1() {
		System.out.println("Hello 1");
		this.method4();
		super.method4();
	}
	public void method4() {
		
	}

}

class Parent {

	final void method2() {
		System.out.println("Smart2");
	}
	public void method4() {
		
	}
}

class Smart3 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = (Child) p;
		c.method2();

	}

	public void method3() {
		System.out.println("Hello 1");
	}
}
