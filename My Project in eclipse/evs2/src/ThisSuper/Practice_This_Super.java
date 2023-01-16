package ThisSuper;

public class Practice_This_Super {

	public static void main(String[] args) {

	}

	public class A {
		int a = 10;

	}

	public class B extends A {
		int a = 20;

		void method() {
			System.out.println(this.a);
			System.out.println(super.a);
		}
	}
}
