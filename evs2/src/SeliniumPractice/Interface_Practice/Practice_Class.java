package SeliniumPractice.Interface_Practice;

public class Practice_Class {

	public static void main(String[] args) {

		P p = new C();
		p.p3(); // show parent but run child
		P.p6(); // parent static method
		C c = (C) p;
		c.p6(); // child static method
		
	}

}
