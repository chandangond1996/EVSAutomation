package SeliniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array_String {

	public static void main(String[] args) {

		String[] name = { "Chandan", "Ram", "Rakesh", "Op", "Shivam", "Sunil", };
		int arreyLength = name.length;
//		 System.out.println(name[4]);
		for (int i = 0; i < arreyLength; i++) {
			String Name = name[i];
			System.out.println(Name);
		}

		//       Rinku Sir
		String std[]=new String[3];
		std[0]=null;
		std[1]="Sunil";
		std[2]="Shivam";
		System.out.println(std[2]);
		
		String y[]= {"I ","Love ","My ","India ",null};
		for (int i =y.length-1; i >=0; i--) {
			System.out.print(y[i]);
		}
		
		ArrayList<Integer> lst=new ArrayList<>();
//		lst.add("ram");
		lst.add(43);
		lst.add(null);
		lst.add(10);
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
//		Iterator it = lst.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
			
		}
		
	}

