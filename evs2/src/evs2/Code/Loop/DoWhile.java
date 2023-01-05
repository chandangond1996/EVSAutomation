package evs2.Code.Loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		method2();
		method(); System.out.println();
		int x=5;
		do {
			x--;
			System.out.println("Hello");
		}while (x>2);
		System.out.println("Thanku");
	}	
	
	public static void method() {
		int x=4;
		
			if(x<10) {
				System.out.println("hii");
		}
			if(x==5) {
				System.out.println("if 2");
			}
			else {
				System.out.println("Red");
			}
	}
	public static void method2() {
		
		Scanner scr=new Scanner (System.in);
		System.out.println("Please enter a Name...");
			String name=scr.next();
		System.out.println("My Name...."+ name);
		System.out.println("My Freind.....");
		String name2=scr.next();
		System.out.println("Second Name...."+name2);
		
	}
	}
