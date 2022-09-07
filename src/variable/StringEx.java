package variable;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//덧셈 연산자, 타입이 다른 경우
		
		String name = "Ja" + "va";
		String str = name+8.0;
		
		System.out.println(name);	//Java
		System.out.println(str);	//Java8.0
		System.out.println(7 + " ");	//7
		System.out.println(" " + 7);	// 7
		System.out.println(7 + "");		//7
		System.out.println("" + 7);		//7
		System.out.println("" + "");	//아무것도 출력되지 않음
		System.out.println(7 + 7 + "");	//14
		System.out.println("" + 7 + 7);	//77

	}

}
