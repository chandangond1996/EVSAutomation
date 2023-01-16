package evs2.Code.Loop;

public class For_Loop {

	public static void main(String[] args) {
		table();
		A_Z();
		System.out.println();
		alpha();
		System.out.println((char)65);   // Down Casting
		
	}
              		
	public static void A_Z() {
		int x=1;
			for(System.out.println(x);x<5; x++) 
				System.out.println(x);
				System.out.println(x);
				System.out.println(x);
			
	}
		
public static void alpha() {
	char x='p';                     // short cut of comment(ctrl + /)
	x=(char)(x-32);                      /// type casting 
	System.out.println(x);
	System.out.println((char)100);       // Down casting
	System.out.println((char)122);
	System.out.println(1.789618537f);    // UP costing compiler
}
	
public static void minuse(int b) {
	
	for(int x=1; x<=10; x++) {
		for(int x2=1; x2<=10; x2++) {
			System.out.printf("%5d",x*x2);
		}
		
		System.out.println();
		
	}
}
	public static void table() {
		String num = "a";
		String num2 = "chandangood";
		for (int i = num.length(); i < num2.length(); i++) {
			System.out.println(i);
		}
	}

}
