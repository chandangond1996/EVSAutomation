package SeliniumPractice.Interface_Practice;

public class UP_Casting_And_Down_Casting {

	public static void main(String[] args) {
		P upCost = new E();
		//upCost.p1();

		if (upCost instanceof C) {
			C duCost = (C) upCost;
			duCost.p1();
		} else if (upCost instanceof D) {
			D duCost = (D) upCost;
			duCost.p1();
		}else if(upCost instanceof E) {
			E duCost=(E)upCost;
			duCost.p1();
		}
	}
}
