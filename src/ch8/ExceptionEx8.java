package ch8;

public class ExceptionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("예외 메시지 : "+e.getMessage());
		}
		
		System.out.println(6);
	}

}
