package ch7;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer b = new Buyer();
		Tv t = new Tv();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		
		b.summary();
		
		System.out.println();
		b.refund(c);
		b.summary();
	}

}
