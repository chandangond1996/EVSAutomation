package Oops.MehodHiding;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Under the Methed Hiding if show parent's method then runtime print parent's method");
System.out.println("And If show child's method then runtime print child's method");

		Child obj=new Child();
		obj.method2();
		Parent obj1=new Child();
		obj1.method1();
	}

	public static void method1() {
		System.out.println("I am method 1 of Chold class");
	}
	public static void method2() {
		System.out.println("I am methed 2 of child class");
	}
}
