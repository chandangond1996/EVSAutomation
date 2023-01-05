package evs2.Code.ExceptionInThread;


public class NullPointerOverview {
	static int b=10;
	int age = 23;
	static NullPointerOverview var;
	public static void main(String[] args) {
		NullPointerOverview har=new NullPointerOverview();
		har=null;
		System.out.println(har.age);
//		System.out.println(har.Method2(null));
//		NullPointerOverview var=new NullPointerOverview();
//		System.out.println(b+" "+"int");
//		NullPointerOverview add=new NullPointerOverview();
//		System.out.println(add);
//		add=null;
//		System.out.println(add);
//		System.out.println("hii");
//		System.out.println(gh());
//		System.out.println(var); // print null
//		System.out.println(b);  // print 34
//		NullPointerOverview obj=new NullPointerOverview();
//		System.out.println(obj); // class ka address
//		obj=null;               // print null
//		System.out.println(obj);
//		obj.Method(500);
//		new NullPointerOverview().Method(500);        // print (NullPointerException)
	}

	public static int gh() {

		int total = 20 + 27;
		NullPointerOverview G = new NullPointerOverview();
		G = null;
		System.out.println(new NullPointerOverview().age);
		System.out.println(b);

		return total;
	}

	public void Method(int a) {
		int total=a+500;
		System.out.println(total);
	}
	public NullPointerOverview Method2(NullPointerOverview a) {
		System.out.println("I am Method");
		return null;
	}
}
