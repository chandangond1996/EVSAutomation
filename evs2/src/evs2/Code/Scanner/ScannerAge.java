package evs2.Code.Scanner;

import java.util.Scanner;

public class ScannerAge {

	
	public static void main(String[] args) {
String h= "";
		int Age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Age");
		 Age=sc.nextInt();
		do {
			if(Age!=26) {
			System.out.println("chandan = age "+Age);
		}
		 if (Age==21){
			int age=sc.nextInt();
			System.out.println("My Age = "+age);
		}
		 else {
			 System.out.println("Do you want another age...");
		 }
		 h=sc.next();
		}while(h.contains("yes"));
			System.out.println("Thank you");
	}

}
