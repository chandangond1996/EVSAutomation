package evs2.Code.ExceptionInThread;

public class CalledotherClass {

	public static void main(String[] args) {
		System.out.println("I am main");
		NullPointerOverview var2=new NullPointerOverview();
		System.out.println(var2.age);
		System.out.println(new NullPointerOverview().getClass().getName());
//		System.out.println(Null());
	}

	public static CalledotherClass Null() {
		CalledotherClass var=new CalledotherClass();
		return var.Null();
	}
}
