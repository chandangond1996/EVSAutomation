package evs2.Code.LogicalProgramm;

public class OccurenceString {

	public static void main(String[] args) {
		toLowerCase();
		System.out.println("=======");
		occurenceWithAsciiCode(); System.out.println("======");
		String word = "Hi I am Chandan".toUpperCase();
//		System.out.println("Length" + word.length());
		char a;
		for (a = 'A'; a <= 'Z'; a++) {
			int count = 0;
			for (int i = 0; i <= word.length() - 1; i++) {
				if (a == word.charAt(i)) {
					count++;
				}

			}
			if (count > 0) {
				System.out.print(a + " =: " + count);
				System.out.println();
			}
		}
	}

	public static void toLowerCase() {
		String word = "Hello".toLowerCase();
		char a;
		for (a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (int i = 0; i <= word.length()-1; i++) {

				if (a == word.charAt(i)) {
					count++;
				}
			}
			if (count > 0)
				System.out.println(a + " " + count);
		}
	}

	public static void occurenceWithAsciiCode() {
		String word = "Hello India I am Mangesh";
		char a;
		for (a = ' '; a <= 120; a++) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (a == word.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(a + " " + count);
			}
		}
	}

}
