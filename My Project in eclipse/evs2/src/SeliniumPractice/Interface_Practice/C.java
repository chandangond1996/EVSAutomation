package SeliniumPractice.Interface_Practice;

public class C implements P , P2{

 	static void p6() {
		System.out.println("I am static method of C");
	}

	private void p9() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am p2 method of C class");
	}

	@Override
	public void p3() {
		// TODO Auto-generated method stub
		System.out.println("I am p3 method of C class");
	}
	@Override
	public void p4() {
		// TODO Auto-generated method stub
		System.out.println("I am p4 method of C class");
	}

	@Override
	public void p5() {
		// TODO Auto-generated method stub
		System.out.println("I am p5 method of C class");
	}

	@Override
	public void p2() {
		// TODO Auto-generated method stub
		System.out.println("I method p2 child");
	}

	@Override
	public void p1() {
		// TODO Auto-generated method stub
		
	}

	public void p() {
		// TODO Auto-generated method stub
		
	}

}
