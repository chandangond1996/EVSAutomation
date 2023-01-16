package evs2.Code.Paramiter;

public class Parameter {

	
	public static void main(String[] args) {
		add(4500,4500);
		add(2000,1000);
		calc(); 
		checkpact(3);
		A();
	}
	public static void add(int y, int w) {
		
		int c=y+w;
		System.out.println(c);
	}
		

public static void calc() {
	
	int fact=1;
	for(int i=1; i<=5; i++) {
		fact=fact*i;
		System.out.println("factorial of"+5+"="+fact);	

	}
	System.out.println("factorial of"+5+"="+fact);	
	
}
public static void checkpact(int num) {
	int temp=1;
	for(int i=1; i<=num; i++) {
		temp=temp*i;

	}
	System.out.println(temp);
}
public static void A() {
	
	int a=5;
	int b=7;
	a=a+2;
	b=b-2;
	System.out.println("a"+" "+a);
	System.out.println("b"+" "+b);
}
}
