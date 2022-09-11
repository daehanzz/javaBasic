package variable;

public class FloatToBinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);	//floatToIntBits는 float타입의 값을 int 타입으로 해석해서반환
		
		System.out.printf("%f%n",f);;
		System.out.printf("%X%n",i);;
	}

}
