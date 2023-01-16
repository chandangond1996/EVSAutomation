package evs2.Code.Paramiter.Return;

public class AadharData {
public int AadharNo;
	public static void main(String[] args) {
		
	}

	public static int createAadharNo() {
		int AadharNo=876565;
		return AadharNo;
	}
	public static void getAadharName() {
		AadharData var=new AadharData();
	
		System.out.println(var.AadharNo);
		String AadharName="Chandan Gond";
		System.out.println(AadharName);
	}
	public static void getAadharAge() {
		AadharData var=new AadharData();
		System.out.println(var.AadharNo);
		int AadharAge=26;
	}
	public static void getAadharAddress() {
		AadharData var=new AadharData();
		System.out.println(var.AadharNo);
		String Address="Mond";
	}
}
