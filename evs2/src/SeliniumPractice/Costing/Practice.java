package SeliniumPractice.Costing;

public class Practice {

	public static void main(String[] args) {
		P p=new D(); 
//		D obj=(D)p;
//		obj.d1();
		if(p instanceof C) {
			C objC=(C)p;
			objC.p1(); objC.c2();
		}else if(p instanceof D) {
			D objC=(D)p;
			objC.d1(); objC.p1();
		}
	}

}
