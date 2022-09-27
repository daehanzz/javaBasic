package ch7;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck();	// 카드 한 벌(Deck)을 만든다.
		Card c = d.pick(0);		// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);
		
		d.suffle();				// 카드를 섞는다
		c = d.pick(0);			// 섞은 후 제일 위의 카드를 뽑는다
		System.out.println(c);
	}

}
