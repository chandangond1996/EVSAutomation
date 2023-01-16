package evs2.Code;

public class Ramkumar {
	static int a=10;                      //[1]... int a=0 [9]..a=10
	int b=15;{	                         //[2]..instance int b=0 [10]..b=15 
	System.out.println("Static"+" "+a); // [11].. print3
	}
	Ramkumar(){                                   // [3]Contractor {}
		System.out.println("I am Constractor");  // [18] print5
	}
	{                                   // [4] ..{}
		System.out.println("Ram");     // [19] print4
	}
	public static void main(String[] args) {         //[5]..(String[]args) [12]
		System.out.println("I am main method");     // [15] print2     
		Ramkumar var=new Ramkumar();               // [6]..obj
		var.Ramkumar();                           // [16] call
		System.out.println("Instance"+" "+var.b);// [20] print7 
	}
	void Ramkumar() {                         //[7]....instance method Ramkumar()
		System.out.println("I am Instance"); //[17] print6
		
	}
	static {    a=20;                      //[8]... {} [13]
		System.out.println("To");    // [14] print1
	}
	
}


