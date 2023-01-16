package evs2.Code.Paramiter;

public class AadharData {

	public static void main(String[] args) {
			Methode();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
			Methode2();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
			Methode3();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
	}

	public static void Methode() {
		int No =Aadhar.getAadharNo(6554443);
		System.out.println("Aadhar No:-" + " " + No);

		int a =Aadhar.getAadharAge(26);
		System.out.println("Age:-" + " " + a);

		String n =Aadhar.getAadharName("chandan Gond");
		System.out.println("Name:-" + " " + n);
	}

	public static void Methode2() {
		int No =Aadhar.getAadharNo(5463728);
		System.out.println("Aadhar No:-" + " " + No);

		int a =Aadhar.getAadharAge(23);
		System.out.println("Age:-" + " " + a);

		String n =Aadhar.getAadharName("Suraj Yadav");
		System.out.println("Name:-" + " " + n);
	}

	public static void Methode3() {
		int No =Aadhar.getAadharNo(4654432);
		System.out.println("Aadhar No:-" + " " + No);

		int a =Aadhar.getAadharAge(20);
		System.out.println("Age:-" + " " + a);

		String n =Aadhar.getAadharName("Babalu Yadav");
		System.out.println("Name:-" + " " + n);
	}
}
