package evs2.Code.LogicalProgramm;

import java.util.Iterator;

public class RemoveTheSpace {

	public static void main(String[] args) {

		String word="Hello I am Pradeep";
		String[] rSpace=word.split(" ");
		for (int i = 0; i < rSpace.length; i++) {
			System.out.print(rSpace[i]);
		}
	}

}
