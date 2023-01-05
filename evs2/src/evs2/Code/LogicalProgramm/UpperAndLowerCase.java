package evs2.Code.LogicalProgramm;

public class UpperAndLowerCase {

	public static void main(String[] args) {

		UpperCase();
		LowerCase();
	}
	
	public static void UpperCase() {
		String word="Hi Virat";
		String upper=word.toUpperCase();
		System.out.println(upper);
	}

	public static void LowerCase() {
		String word="Hi Virat";
		String lower=word.toLowerCase();
		System.out.println(lower);
	}
}
