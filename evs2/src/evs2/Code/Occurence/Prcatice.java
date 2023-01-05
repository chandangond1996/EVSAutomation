package evs2.Code.Occurence;

public class Prcatice {

	public static void main(String[] args) {
		occurence();System.out.println("=======");occurenceAsciiCode();
	}

	public static void occurence() {
		String word = "Hello I am pradeep".toLowerCase();
		char a;

		for (a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (int i = 0; i <= word.length() - 1; i++) {
				if (a == word.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(a + " =:" + count);
			}
			//System.out.println();
		}
	}

	public static void occurenceAsciiCode() {
		String word = "Hello Pary My Nafy".toLowerCase();
		char a;
		for (a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (int i = 0; i < word.length(); i++) {
				if (a == word.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(a + " =" + count);
			}
//			System.out.println();
		}
	}
}