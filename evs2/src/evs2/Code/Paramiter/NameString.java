package evs2.Code.Paramiter;

public class NameString {

	public static void main(String[] args) {
		String num="9598935534";
		 Name("chandan ","Gond","Dudawa Dharampur",num);
		long num2=9598797;
		add("Mangesh ","Sir",num2);
	}
	public static void Name(String firstName, String lastName, String Vill, String Mobile ) {
		String FullName=firstName+lastName;
		
		System.out.println(FullName);
		   System.out.println(Vill);
		    System.out.println(Mobile);
}
  public static void add(String firstadd, String lastadd, long telephone) {
	  String fullAdd=firstadd+lastadd;
	  
	  System.out.println(fullAdd);
	  System.out.println(telephone);
	  
  }
  
}
