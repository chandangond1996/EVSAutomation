package evs2.Code.LogicalProgramm;

public class PalindromString {

	public static void main(String[] args) {

		String word = "jahaj Hello";
		char[] a = word.toCharArray();
		String str="";
		for (int i =word.length()-1; i >= 0; i--) {
			str = str + a[i];
		}
		if (word.equalsIgnoreCase(str)) {
			System.out.println("This is a Palindrom");
		} else {
			System.out.println("this is not palindrom");
		}
	}

}
