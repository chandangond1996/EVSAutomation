///////
public class Test {

	public static void main(String[] args) {

		palindromNubmer(121);
		palindromNubmer(456);
		palindrome2();
//		int x;
//		x = 5;
//		{
//			int y = 6;
//			System.out.println(10 + x +  y + 10);
//		}
//		System.out.println(x);

	}

	public static void palindromNubmer(int num) {

		int temp = num;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (num == rev) {
			System.out.println(num + " is palindrome Number.");
		} else {
			System.out.println(num + " is not a palindrome number..");
		}

	}

	public static void palindrome2() {
		int num = 151;
		int temp = num;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
			System.out.println(rev);
		}
		if (num == rev) {
			System.out.println(num + " is palindrom 2");
		} else {
			System.out.println(num + " isn't palindrome 2");
		}
	}

} /// 5 6 i have no idea 11
