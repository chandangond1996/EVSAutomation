package RinkuSir.Array2Dimention;

import java.util.Iterator;

public abstract class Array_P {

	public static void main(String[] args) {
		//array();
		array2D();
		//ArrayP();
		// int a[]=new int[3];
		// a[0]=1;
		// a[1]=2;
		// a[2]=3;
		//
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }

	}

	public static void ArrayP() {
		int a[] = { 10, 21, 30, 50 };
		int i[] = { 10, 20, 40, 60 };
		System.out.println(a == i);
		if (a.length == i.length) {
			for (int j = 0; j < i.length; j++) {
				if (a[j] != i[j]) {
					System.out.println(a[j] + " " + i[j] + " " + "Not Equal");
				}
			}
		}
	}

	public static void array2D() {

		int a[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = i;
				System.out.println(a[i][j]);
			}
		}
	}

	public static void array() {
		String s[][] = { { "Ram", "Op", "Shivam" }, { "Sunil", "ShivBahadur", "Rakesh" } };
		System.out.println(s.length);
		for (int i = 0; i <= s.length; i++) {
			for (int j = 0; j <= s.length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}
}
