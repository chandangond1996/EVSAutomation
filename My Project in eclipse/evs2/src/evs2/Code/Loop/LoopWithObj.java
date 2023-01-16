package evs2.Code.Loop;

public class LoopWithObj {
	static int x=1;
	int i=5;
	public static void main(String[] args) {
		method();
		method2();
		
	}
	public static void method() {
		int i=0;
		while (i<=5) {
			int j=5;
			while(j>i) {
				System.out.print(" ");
				j--;
			}
			int k=0;
			while (k<=i) {
				System.out.print(" *");
				k++;
			}
			System.out.println();
			i++;
		}
	}
	public static void method2() {
		int j=0;
		  for(new LoopWithObj().i=0; x>=j; ++j) {
			for(new LoopWithObj().i=0; x>=j; j++) {
				System.out.print(" India");
			}
			System.out.println();
		}
	}
}
