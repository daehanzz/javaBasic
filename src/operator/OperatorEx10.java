package operator;

public class OperatorEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1000000;
		
		int result1 = a * a / a;	// 1000000 * 1000000 / 1000000
		int result2 = a / a * a;	// 1000000 / 1000000 * 1000000
		
		System.out.printf("%d * %d / %d = %d%n",a,a,a,result1);
		//오버 플로우에 의해 다른 값이 출력됨
		//같은 의미의 식이라도 연산의 순서에따라 다른 결과를 얻을 수 있다
		System.out.printf("%d / %d * %d = %d%n",a,a,a,result2);
	}

}
