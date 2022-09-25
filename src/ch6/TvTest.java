package ch6;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");

	}

}
class Tv{
	// tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// tv의 기능(메서드)
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}