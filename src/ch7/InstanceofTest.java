package ch7;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) 
			System.out.println("FireEngine 인스턴스");
		
		if(fe instanceof Car)
			System.out.println("Car 인스턴스");
		
		if(fe instanceof Object)
			System.out.println("Object 인스턴스");
		
		System.out.println(fe.getClass().getName());	// 클래스의 이름을 출력
	}

}
