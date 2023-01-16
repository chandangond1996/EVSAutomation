import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {

		int num = 242; int original=num;
		int rev = 0;
		int r;
		while (num > 0) {
	
			r=num%10;
				rev=rev*10+r;
				num=num/10;
				
				
		
			
		}System.out.println(rev); System.out.println(num);
		if(original==rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		sc.close();
		String reverse="";
		System.out.println(s.length());
		for(int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
			}
	System.out.println(reverse);
	
	if(s.equals(reverse)) {
		System.out.println("String is palidrome");
	} else {
		 System.out.println(" String is not palindrome");
	}
	}

	


}
