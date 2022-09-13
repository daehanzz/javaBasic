package operator;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c1 = 'a';
		
//		char c2 = c1 + 1;	//컴파일 에러 발생
		char c2 = 'a' + 1;	//리터럴 간의 연산은 실행과정동안 변하는 값이 아니기때문에
							//컴파일 시에 컴파일러가 계산해서 그 결과로 대체함
		
		System.out.println(c2);
	}

}
