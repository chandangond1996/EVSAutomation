package evs2.Code.LogicalProgramm;

public class CountTheVowels {

	public static void main(String[] args) {

		String word = "Hello Virat where are you".toLowerCase();
		int Vowel = 0;
		int space = 0;
		int Consonant = 0;
		int W = 0;
		for (int i = 0; i < word.length(); i++) {
			char a = word.charAt(i);
			++W;
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
				++Vowel;
				System.out.println(a + "=: " + W);
			} else if (a == 32) {
				++space;

			} else {
				++Consonant;
			}

		}
		System.out.println("Vowel" + " " + Vowel);
		System.out.println("Space" + " " + space);
		System.out.println("Consonant" + " " + Consonant);
	}

}
