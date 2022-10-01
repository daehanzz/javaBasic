package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);	// 실행 X
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			if(e instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}

}
