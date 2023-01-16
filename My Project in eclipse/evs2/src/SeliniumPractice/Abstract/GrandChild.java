package SeliniumPractice.Abstract;

public class GrandChild extends Child {
	final int a = 10;

	public static void main(String[] args) {
		final int a;
		a = 10;
		Child chObj = new GrandChild();
		Parent obj = chObj;
		obj.laptop();
		chObj.call();
		chObj.callDivert();
		chObj.bluetooth();
		chObj.shearMI();
		chObj.speakar();
		chObj.method6();
	}

	// construter default value deta hai
	public void method5() {

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Hello India");
	}

	@Override
	public void speakar() {
		// TODO Auto-generated method stub
		System.out.println("Sound");
	}

	@Override
	public void shearMI() {
		// TODO Auto-generated method stub
		System.out.println("send any thing ");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("I am method6 of Parent");
	}

	@Override
	public void callDivert() {
		// TODO Auto-generated method stub
		System.out.println("call divert other number");
	}

	@Override
	public void mobile() {
		// TODO Auto-generated method stub
		
	}
}
