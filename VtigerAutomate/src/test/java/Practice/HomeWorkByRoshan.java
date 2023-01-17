package Practice;

public class HomeWorkByRoshan {

	public static void main(String[] args) {
		checkDuplicate();
		checkSmalAndLargNo();
		accendingNo();
		descendingNo();
	}

	public static void checkDuplicate() {
		int[] arry = { 3, 4, 6, 8, 4, 7, 2, 9 };
		for (int i = 0; i < arry.length; i++) {
			for (int j = i + 1; j < arry.length; j++) {
				if (arry[i] == arry[j]) {
					System.out.println("It is duplicate value " + arry[j]);
				}
			}
		}
	}

	public static void checkSmalAndLargNo() {
		int[] arry = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int smalNo = arry[0];
		int largNo = arry[0];
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] < smalNo) {
				smalNo = arry[i];
			} else if (arry[i] > largNo) {
				largNo = arry[i];
			}
		}
		System.out.println("It is a small No. " + smalNo);
		System.out.println("It is a larg No. " + largNo);

	}

	public static void accendingNo() {
		int[] arr = { 10, 9, 3, 5, 2, 6 };
		int temp = 0;
		System.out.println("It is Acceding Number............");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 9 > 3
					temp = arr[i]; // temp = 10
					arr[i] = arr[j]; // arr[i] = 9
					arr[j] = temp; // arr[j] = 10
				}
			}
			System.out.print(arr[i] + " ");
		}

	}

	public static void descendingNo() {
		int[] arr = { 10, 9, 3, 5, 2, 6 };
		int temp = 0;System.out.println();
		System.out.println("It is Desceding Number............");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) { // 9 > 3
					temp = arr[j]; // temp = 10
					arr[j] = arr[i]; // arr[i] = 9
					arr[i] = temp; // arr[j] = 10
				}
			}
			System.out.print(arr[i] + " ");
		}

	}
}
