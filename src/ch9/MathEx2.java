package ch9;

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = Integer.MIN_VALUE;
		
		System.out.println("i = "+i);
		System.out.println("-i = "+(-i));
		
		try {
			System.out.printf("negateExact(%d) = %d%n",10,Math.negateExact(10));
			System.out.printf("negateExact(%d) = %d%n",-10,Math.negateExact(-10));
			System.out.printf("negateExact(%d) = %d%n",i,Math.negateExact(i));	// 예외발생
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.printf("long타입으로 변환 negateExact(%d) = %d%n",(long)i,Math.negateExact((long)i));
		}
	}

}
