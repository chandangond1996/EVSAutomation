package evs2.Code;

public class Var_arg {

	public static void main(String[] args) {

		method(10,20,30,40);
		
	}
	public static void method(int...is) {
		//System.out.println("Hello"); 
		int sum=0;
		for (int i = 0; i < is.length; i++) {
			sum=sum+is[i];
//			System.out.println(is[i]);
		}System.out.println(sum);
	}

}
