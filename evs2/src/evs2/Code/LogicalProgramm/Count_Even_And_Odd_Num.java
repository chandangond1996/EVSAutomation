package evs2.Code.LogicalProgramm;

public class Count_Even_And_Odd_Num {

	public static void main(String[] args) {

		int num = 264564;
		int countEven = 0;
		int countOdd = 0;
		while (num > 0) {
			int rem = num % 10;
			System.out.println(rem);
			if (rem % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
			num = num / 10;
		}
		System.out.println("Count Number of Even " + countEven);
		System.out.println("Count Number of Odd " + countOdd);
	}

}
