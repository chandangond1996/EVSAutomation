package evs2.Code.ExceptionInThread;

public class StackOverFlow {

	public static void main(String[] args) {
		System.out.println("I am main method");
		Stack();
	}
	
	public static void Stack() {
		Stack();
	}
}	
