package ch7;

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card("HEART",10);
		
//		c.NUMBER5;	// 에러
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
