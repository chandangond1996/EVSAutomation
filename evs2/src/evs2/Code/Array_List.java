package evs2.Code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {

		List<String> lst=new ArrayList<String>();//faxible and groveble
		lst.add("Rakesh");
		lst.add("Ram");
		lst.add("Shivam");
		lst.add("Shivam");
		lst.add("Sunil");
		lst.add("OP");
		
		System.out.println(lst.size());
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}System.out.println();
		lst.add("Mangesh");
		lst.add("Rishikesh");
		lst.add("Chandan");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}
	public static void method2() {
		List<String> lst=new ArrayList<String>();
		lst.add("Rakesh");
		lst.add("Ram");
		lst.add("Shivani");
		lst.add("Shivam");
		lst.add("Sunil");
		lst.add("OP");
		
	}
}
