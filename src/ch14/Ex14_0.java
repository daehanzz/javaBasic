package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
	public static void main(String[] args) {
		// Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		// Function<String, Integer> f = 클래스이름::메서드이름; 
		Function<String, Integer> f = Integer::parseInt;	// 메서드 참조 
		// Function<String, Integer> f = (String s) -> Integer.parseInt(s); -> 메서드 참조 람다식 변환
		
		System.out.println(f.apply("123")+100);
		
		// Supplier는 입력X , 출력O
		// Supplier<MyClass> s = () -> new MyClass();
		Supplier<ex_14_MyClass> s = ex_14_MyClass::new;
		ex_14_MyClass mc = s.get();	// MyClass 객체 반환
		System.out.println(mc);			// new 연산자로 생성하기 때문에 
		System.out.println(s.get());	// 둘의 주소가 다르다
			
		Function<Integer, ex_14_MyClass> f2 = ex_14_MyClass::new;
		ex_14_MyClass mc2 = f2.apply(12);
		System.out.println("mc2.iv = "+mc2.iv);	// 12
		
		Function<Integer, int[]> f3 = int[]::new;
		int[] arr = f3.apply(100);
		System.out.println("arr.length = "+arr.length);
	}
}

class ex_14_MyClass {
	int iv;
	
	ex_14_MyClass() {
		
	}
	
	ex_14_MyClass(int iv) {
		this.iv = iv;
	}
}