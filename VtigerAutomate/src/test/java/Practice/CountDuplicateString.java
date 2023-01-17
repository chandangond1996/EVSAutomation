package Practice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountDuplicateString {

	public static void main(String[] args) {
		removeDuplicate();
	}

	public static void remDupl() {
		String word = "Hi I am Roshan Yadav".toLowerCase();
		int count;
		char i;
		for (i = ' '; i < 120; i++) {
			count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (i == word.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(i + " =" + count);
			}
		}
	}

	public static void removeDuplicate() {
		Set<Character> data = new LinkedHashSet();
		String word = "Hello I am chandan aa bb cc";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			data.add(ch);
		}
		Iterator itr = data.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");

		}
	}
}
