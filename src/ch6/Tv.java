package ch6;

public class Tv {
	// tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// tv의 기능(메서드)
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
