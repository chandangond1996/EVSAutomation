package evs2.Code;

public class String_today {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		
		StringBuffer s3 = new StringBuffer("Hello");
		StringBuffer s4 = new StringBuffer("Hello");
		s3.append(" Hi");
		s4.append("Ram");
		System.out.println(s3);
		System.out.println(s4);
		
		StringBuilder s5= new StringBuilder("Hello");//Thread
		StringBuilder s6= new StringBuilder("Hello");
		s5.append("Shyam");
		System.out.println(s5);
		
	}

}
 // Heap is a one type Memory Aria in a String
// String pool is an aria in to the Heap aria to manage the aria 
   //equal is the method check the content
  // String is Emuteable
 // not chengeable
// StringBuffer is a mutable

 // without assign any mothed append is mutable.
// Assign any method after append is a Emutable.

    // OverLod is a counstructor.
   //String is a ThreadSefty.
  // Thread is procces.
 // Dead lock =Not free proceser = tb aata jb Thread Sefy na ho
// Not Secronization =krambandh