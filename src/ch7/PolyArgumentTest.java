package ch7;

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은돈은 "+b.money+"만원 입니다");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점 입니다.");
	}

}
