package evs2.Code;

import java.util.Iterator;

public class Arrey {

	public static void main(String[] args) {

		String y[]= {"I ","Love ","My ","India "};
		for (int i =0; i <=y.length-1; i++) {
			
			if(i%2==0) {
				System.out.println(y[i]+" ");
			}
			if(i%2!=0) {
				int b=y[i].length();
				String s=" ";
				for(int j=b-1; j>=0; j--) {
					char ch=y[i].charAt(j);
					s=s+ch;
				}
				System.out.println(s+ " ");
			}
		}
	}

	
}

//   I Love My India
//   I evoL My aidnI