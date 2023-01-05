package evs2.Code.Scanner;

import java.util.Scanner;

public class LipiYear {

	public static void main(String[] args) {
		int year; String Y_N= "";
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Please Enter year. ..");
			year=sc.nextInt();
			if(year%4==0) {
				System.out.println("LipYear..");
			}else 
				System.out.println("Simple Year..");
			System.out.println("Do you want check another no (Y/N)");

			Y_N=sc.next();
		}while(Y_N.contains("Y"));
			System.out.println("Thank you..bye..");
		
	}

}
