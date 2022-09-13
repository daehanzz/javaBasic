package operator;

public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);	// b는 int타입과 long타입의 연산이기때문에 결과가 long타입
										// >> 올바른 값이 출력됨
	}

}
