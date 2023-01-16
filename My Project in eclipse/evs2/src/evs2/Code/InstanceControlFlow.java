package evs2.Code;

public class InstanceControlFlow {
//static short a=28;
	int i=10;         /// [4] int i=0.......[8] i=10
{        // [5] {} [9]  execution of instance block
	methodOne(); // jump
	System.out.println("first Instance Block"); //[13]
//	System.out.println(a);
}

	public void methodOne() { //  InstanceMethod [6] methodOne()...[10]
		System.out.println("method One");  // [11] print
		System.out.println(j);             // [12] print
	}
//	static {
//	System.out.println("static block");
//	System.out.println(a);
//}
int j=20;   // [7] int j=0  //.....[14] j=20
	public static void main(String[] args) {  // staticMethod [1]...[2]
		InstanceControlFlow var=new InstanceControlFlow();//..............[3]
		System.out.println(var.j);//   [15] 
		
	}
	
}
