package ch8;

public class ExceptionEx12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();	// 같은 클래스내의 static 멤버이므로 객체생성없이 직접 호출가능
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}

}
