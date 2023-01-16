package RinkuSir.Array2Dimention;

public class Practice {

	public static void main(String[] args) {

		int x[] = { 1, 2, 3 };
		int y[] = { 1, 2, 5 };
		System.out.println(x[x[x.length-2]]);
		if (x.length == y.length) {
			for (int i = 0; i < x.length; i++) {
				if (x[i]!= y[i]) {
					System.out.println(x[i] + " " + y[i] + " Equal");
				} //else if (x[i] != y[i]) {
//					System.out.println(x[i] + " " + y[i] + " Not Equal");
//				}
			}
//		System.out.println(x[2]==y[2]);
		}else {
			System.out.println("Not Equal Length");
		}
	}
	
}
