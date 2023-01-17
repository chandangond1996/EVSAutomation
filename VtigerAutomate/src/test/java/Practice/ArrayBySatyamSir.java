package Practice;

public class ArrayBySatyamSir {

	public static void main(String[] args) {

		String[] word = { "shivam", "ram", "sunil", "shivam" };
		String name = "";
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i] == word[j]) {
					name = word[i];
					System.out.println(name);
					break;
				} // farther(move) / further(proceed)
			}
		}
		char[] arr = name.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == arr[arr.length - 1]) {
				arr[i] = (char) (arr[i] - 32);
			}
			System.out.print(arr[i]);
		}
	}

}
