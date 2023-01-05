package ThisSuper;

public class ParentClass {
	int b=2;

	public ParentClass() {
		System.out.println("I am constructer of Parent ");
	}

	public ParentClass(int a) {
		System.out.println(a);
	}
	public ParentClass(String b) {
		
	}
	public ParentClass(ParentClass obj) {
		System.out.println(obj);
	}
	public void c1() {
		System.out.println("c1");
	}
}
                                                         