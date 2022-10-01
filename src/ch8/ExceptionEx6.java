package ch8;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);	//실행되지 않는다
		} catch (Exception e) {
			// TODO: handle exception
			
			/*
			 * ArithemeticException은 
			 * Exception의 자식이므로 Exception타입의 참조변수를 선언한
			 * catch 블럭의 문장이 실행된다
			 * */
			System.out.println(5);
		}
		
		System.out.println(6);
	}

}
