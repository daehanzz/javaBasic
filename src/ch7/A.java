package ch7;

public class A {

	public void autoPlay(I i) {
		i.play();
	}
	
	public void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}
