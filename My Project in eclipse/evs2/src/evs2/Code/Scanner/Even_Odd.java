package evs2.Code.Scanner;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		int x; String Y_N= "";
		Scanner var=new Scanner(System.in);
		do {
			System.out.println("Please Enter No. .");
			x=var.nextInt();
			if(x%2==0){
				System.out.println("Even ");
			}else 
				System.out.println("Odd");
				System.out.println("Do you want check another No..");
			
			Y_N=var.next();
		}while(Y_N.contains("Y"));
		System.out.println("Thank you bye bye.......");
	}

}
