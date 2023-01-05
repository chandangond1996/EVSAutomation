package evs2.Code;

public class Variable {
	static int a=4;
	int hra=500;
	
	public static void main(String[] args) {
		
		int not=Salary();  System.out.println(not);                            /// Called local method
		 System.out.println();
           salary();                            /// Called local method
            System.out.println(Total()); 
          
	}
	public static int Total() {
		Variable var=new Variable();
		System.out.println(var.hra);
		Variable var1=new Variable();
		var1.hra=100;
		System.out.println(500+var1.hra);
		 a=2;
		return a*a;
	}
	public static int Salary() {
		int besic = 10000;
		  int hra = 2000;
		   int pf = 1200;
		hra=500;
		hra=900;
		hra=200;
		long Grass = (besic+hra+pf);
		   System.out.println("Rakesh"+" "+Grass);
		   Variable var3=new Variable(); var3.hra=200; 
		   return var3.hra;
		   			
	}
	public static void salary() {
		int basic =5000;
		  int hra =2000;
		    int ta =1000;
		     int pf =1500;
		      int bonus =1200;
		int Grass =(basic+hra+ta-pf+bonus);
			System.out.println("Ram"+" "+Grass);
			
			System.out.println(10);
			System.out.println(010);
			System.out.println(0x10);
			System.out.println((9_7));
			
			
			
	}
	
	
	}
