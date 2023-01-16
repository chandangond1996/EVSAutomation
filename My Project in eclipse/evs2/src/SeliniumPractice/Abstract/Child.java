package SeliniumPractice.Abstract;

public abstract class Child extends Parent {

	public abstract void mobile();
	public void method() {
		System.out.println("I am method 1 of child class ");
	}

	@Override
	public void bluetooth() {
		// TODO Auto-generated method stub
		System.out.println("I am bluetooth of Child class");
	}
	public abstract void callDivert();
	public abstract void method5();
}
