package evs2.Code;

public class CantrolFlow {
static int x;

short total=500;

static { x=70;
	System.out.println(x);
	
}
	public static void main(String[] args) {
		System.out.println("I am Main Method");
		M1();
		x=10;
		System.out.println(x);
		CantrolFlow var=new CantrolFlow();
		var.total=1000;
		System.out.println(var.total);
		CantrolFlow var2=new CantrolFlow();
		System.out.println(var2.total);
		var2.total=2000;
		System.out.println(var2.total);
	}
static {
	int b=10;
	System.out.println(b);
}
static short a=80;

static {
	x=50;
	System.out.println(a);
}
	public static void M1() {
		int a=10+20;
		System.out.println(a);
	}
	
}

