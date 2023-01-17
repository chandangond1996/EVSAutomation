package Self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PracticeCollection {

	public static void main(String[] args) {

		
		Set lst = new TreeSet();
		lst.add("A");
		lst.add("B");
		lst.add("10");
		System.out.println(lst.remove("10"));
		System.out.println(lst);
	}

}
