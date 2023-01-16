package evs2.Code.Paramiter;

public class If {

	public static void main(String[] args) {
		int Salary=Cond(5000,1000,500);
			System.out.println("Ram"+" "+Salary);
		int NetSalary=Cond(22000,2000,500);
			System.out.println("Rakesh"+" "+NetSalary);
		int NextSalary=Cond(8000,2000,500);
			System.out.println(NextSalary);
	}

	public static int Cond(int besic, int hra, int pf) {
		int TotalSalary=besic+hra+pf;
		if(10000>TotalSalary) {
			return hra;
		}
		if(11000>TotalSalary) {
			return pf;
		}
		
		return TotalSalary;
		
	}
	
}
