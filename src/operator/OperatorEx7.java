package operator;

public class OperatorEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);		
		System.out.println(c);	// 44 값의 손실이 발생
	}

}
