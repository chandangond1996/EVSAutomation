package evs2.Code.Paramiter;

public class ReturnValue {

	public static void main(String[] args) {
		int GrossSalary=Calc(20000, 2000, 1500);
		 int taxValue=GrossSalary*10/100;
		  int NetSalary=GrossSalary-taxValue;
		   System.out.println("Shivam"+" "+NetSalary);
		   int Ram=Calc(5000, 1000, 500);
		  int Mangesh=Calc(10000,2000,1500);
		 System.out.println("mangesh"+" "+Mangesh);
		System.out.println("Ram"+" "+Ram);
			
		int rakesh=Calc(60000,25000,10000);
	     int taxValue2=rakesh*5/100;
	      int netSalary3=rakesh-taxValue2;
	       System.out.println("Rakesh"+" "+netSalary3);
	    
	    Volume_of_Room(10,5,3);
	     int fit=50; int Fit=20;
	      int squareFit=Area(fit,Fit);
	       System.out.println("square"+squareFit);
//		  int cm=30;  int Cm=20;
	    circleArea(22/7, 10);
	}

	public static int Calc(int besic, int hra, int pf) {
		int GrossSalary=besic+hra+pf;
		return GrossSalary;
	     
	}
	public static void Volume_of_Room(int length, int height, int width) {
		int size=length*height*width;
		System.out.println("Volume Of Room"+" "+size);
		 		 
	}
	public static int Area(int length, int width ) {
		int Field=length*width;
		return Field;
	}
	public static void circleArea(int area, int radius) {
		int volume=area*radius*radius;
		System.out.println("circleArea"+" "+volume);
	}
}
