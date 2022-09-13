package operator;

public class OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1_000_000;	//1,000,000 1백만
		int b = 2_000_000;	//2,000,000 2백만
		
		long c = a*b;	// a*b = 2,000,000,000,000 ?
		
		System.out.println(c);	// -1454759936 
								//  >> int 타입과 int 타입의 연산결과는 int타입이기때문에 다른값 출력
	}

}
