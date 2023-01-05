package evs2.Code.LogicalProgramm;

public class Swaping {

	public static void main(String[] args) {

		int a=1; int b=4;
		System.out.println(a+" "+b);
		a=a+b;     //5
		b=a-b;    //4
		a=a-b;   //1
		System.out.println(a+" "+b); System.out.println("======");
		swaping();
	}

	public static void swaping() {
		int a=2; int b=3;
		System.out.println(a+" "+b);
		a=a+b;     //5
		b=a-b;    // 2
		a=a-b;   // 3
		System.out.println(a+" "+b);
	}
}
