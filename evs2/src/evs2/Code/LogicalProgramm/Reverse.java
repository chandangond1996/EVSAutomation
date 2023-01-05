package evs2.Code.LogicalProgramm;

import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {
		palindrome();
		System.out.println();
		String v = "Hey I am Rohan";
		String[] sp = v.split(" ");
		// System.out.println(sp.length);
		for (int i = 0; i < sp.length; i++) {
			char[] ar = sp[i].toCharArray();
			for (int j = sp[i].length() - 1; j >= 0; j--) {
				System.out.print(ar[j]);
			}
			System.out.print(" ");
		}
	}

	// I am the kink of the jungle // find the ucrence of string
	public static void Reverse2(String name) {
		String[] arr = name.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] cA = arr[i].toCharArray();
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(cA[j]);
			}
			System.out.print(" ");
		}
	}

	public static void palindrome() {
		String name = "Hello India";
		String[] arr = name.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] c = arr[i].toCharArray();
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
	}

}
