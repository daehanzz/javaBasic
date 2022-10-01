package ch8;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * try 블럭내에서 예외가 발생하면 
		 * 예외가 발생한 위치 이후에 있는 try블럭의 문장은
		 * 실행되지 않는다.
		 * 따라서 try블럭에 포함시킬 코드의 범위를
		 * 잘 선택해야 함
		 * */
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);	//실행되지 않는다
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(5);
		}
		
		System.out.println(6);
	}

}
