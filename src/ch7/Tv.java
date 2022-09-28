package ch7;

public class Tv extends Product {

	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
	Tv(){
		// 부모클래스의 생성자 Product(int price)를 호출한다
		super(100);
	}
	
	// Object 클래스의 toString()을 오버라이딩
	public String toString() {
		return "Tv";
	}

}
