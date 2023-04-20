package ch15;

public class SuperUserInfo {
	String name;
	String password;

	SuperUserInfo() {
		this("UnKnown","1111");
	}
	
	public SuperUserInfo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
}
