package evs2.Code.Paramiter;

public class Static_NonStatic {
static int diposit=2000;
int withdrow=1000;

	public static void main(String[] args) {
		Static_NonStatic var=new Static_NonStatic();
		int total=var.Salary(500,400);
		System.out.println(total);
		int Total=var.Salary(100, 500);
		System.out.println(Total);
		Balance(10000,5000);
		
	}

	public int Salary(int ram, int shyam) {
		int total=ram+shyam;
		int r=3;
	
		return total;
		
	}
	public static void Balance(int credit, int debit) {
		int Total=credit-debit;
		int diposit=1000;
		System.out.println(Total+Static_NonStatic.diposit);
		Static_NonStatic var=new Static_NonStatic();
		System.out.println(var.withdrow);
		System.out.println(var.withdrow+diposit+"chandan");
		System.out.println("Ram"+var.withdrow+diposit);
	}
}
