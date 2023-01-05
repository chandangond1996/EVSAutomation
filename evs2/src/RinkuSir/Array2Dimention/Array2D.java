package RinkuSir.Array2Dimention;


public class Array2D {
static int a[]=new int[5];
	public static void main(String[] args) {
		
		System.out.println(a[0]);
		objectArray(10);
		System.out.println("=================");
		stringArray();
		System.out.println("=================");
		intArray();

	}

	public static void objectArray(int a) {
		Object[][] i = new Object[3][3];
		i[0][0] = "A";
		i[0][1] = "B";
		i[0][2] = "C";
		i[1][0] = "D";
		i[1][1] = "E";
		i[1][2] = "F";
		i[2][0] = 'G';
		i[2][1] = '5';
		i[2][2] = "I";
		for (Object[] js : i) {
			for (Object js2 : js) {
				System.out.print(js2 + " ");
			}
			System.out.println();
		}
	}

	public static void intArray() {
		int[][] i = new int[3][3];
		i[0][0] = 1;
		i[0][1] = 2;
		i[0][2] = 3;
		i[1][0] = 4;
		i[1][1] = 5;
		i[1][2] = 6;
		i[2][0] = 7;
		i[2][1] = 8;
		i[2][2] = 9;
		for (int[] js : i) {
			for (int js2 : js) {
				System.out.print(js2 + " ");
			}
			System.out.println();
		}
	}

	public static void stringArray() {
		String[][] i = new String[3][3];
		i[0][0] = "Ram";
		i[0][1] = "Op";
		i[0][2] = "Rakesh";
		i[1][0] = "Shivam";
		i[1][1] = "Mangesh";
		i[1][2] = "Sunil";
		i[2][0] = "Raju";
		i[2][1] = "Vishal";
		i[2][2] = "ShivBahadur";
		for (String[] js : i) {
			for (String js2 : js) {
				System.out.print(js2 + " ");
			}
			System.out.println();
		}

	}

}
