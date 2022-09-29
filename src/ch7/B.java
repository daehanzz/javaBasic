package ch7;

public class B implements I {

	public void play() {
		System.out.println("play in B class");
	}
	
	public void methodB() {
		System.out.println("methodB in B class");
	}
	
	public String toString() {
		return "class B";
	}
}
