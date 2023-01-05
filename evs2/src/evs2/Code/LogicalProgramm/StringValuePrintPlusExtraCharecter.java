package evs2.Code.LogicalProgramm;

public class StringValuePrintPlusExtraCharecter {

	public static void main(String[] args) {
		check();
		System.out.println("========");
		wordPrint();
		System.out.println("=========");
		printOneExtraValue("Hello India");
		System.out.println("=======");

		String word = "chandan";
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int b = (int) c[i];
			b++;
			System.out.print((char) b);
		}
	}

	public static void wordPrint() {
		String word = "p";
		for (int i = 0; i <= word.length() - 1; i++) {
			int acciiDown = (char) word.charAt(i);
			char conv = (char) ((int) acciiDown + 1);
			System.out.print(conv);
		}
		System.out.println();
	}

	public static void printOneExtraValue(String word) {
		for (int i = 0; i < word.length(); i++) {
			char wordChar = word.charAt(i);
			System.out.print(++wordChar);
		}
		System.out.println();
	}

	public static void check() {
		String word = "po";
		char a;
		for (a = 32; a <= 'z'; a++) {
			for (int i = 0; i < word.length(); i++) {
				if (a == word.charAt(i)) {
					System.out.print(++a);
				}
			}
		}
		System.out.println();
	}
}
