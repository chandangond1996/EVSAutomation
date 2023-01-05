package evs2.Code.LogicalProgramm;

public class CountSpace {

	public static void main(String[] args) {

		String word = "Hello Virat Whare are you";
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 32) {
				count++;
			}
		}
		System.out.println("Space" + " " + count);
	}

}
