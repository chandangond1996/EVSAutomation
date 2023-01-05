package evs2.Code.LogicalProgramm;

public class Reverse_String {

	public static void main(String[] args) {
// Hey I am Rohan
		reverse();
		System.out.println("=====");
		String name = "Hey I am Rohan";
		char c[] = name.toCharArray();

		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}System.out.println("------");
Reverse();System.out.println("-----");
	}

	public static void Reverse() {
		String name = "Hey I am Rohan";
		String[] w = name.split("");
		String rev = "";
		for (int i = 0; i < w.length; i++) {
			String ww = w[i];
			 rev = ww + rev;
		}System.out.println(rev);
	}

	public static void reverse() {

		String s = "Hello";
		char[] a = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}

}
