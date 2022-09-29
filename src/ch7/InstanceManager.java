package ch7;

public class InstanceManager {
	
	public static I getInstance() {
		return new B();
	}

}
