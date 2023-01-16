package evs2.Code;

public class StringConcatinate {

	public static void main(String[] args) {
		String Name=A("chandan ", "Gong");
			System.out.println(Name);
			
		int Total=B(B(10,20),B(5,5));
			System.out.println(Total);
			
		
	}
	public static String  A(String i, String x) {
		String name=i+x;
		
		return name;
		
	}
	public static int B(int i,int x) {
		int total=5+i+x;
		return total;
	}
}
