package ch14;

import java.lang.StackWalker.Option;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<String> optStr = Optional.of("abcde");
//		Optional<Integer> optInt = optStr.map((s)->s.length());	// String 타입 optional을 Integer 타입으로 변환
		Optional<Integer> optInt = optStr.map(String::length);	// 메소드참조 , 위와같음
		
		System.out.println("optStr = "+optStr.get());
		System.out.println("optInt = "+optInt.get());
		System.out.println();
		
		int result1 = Optional.of("123").filter(s -> s.length() > 0)
										.map(Integer::parseInt).get();
		
		int result2 = Optional.of("").filter(s -> s.length() > 0)
									.map(Integer::parseInt).orElse(-1);	// orElse 값이 null이면 괄호 안의 값을 반환
		
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("result3 = %d%n", x));
		System.out.println();
		
		OptionalInt optInt1 = OptionalInt.of(0);	// 0저장
		OptionalInt optInt2 = OptionalInt.empty();	// 빈 객체를 생성
		
		System.out.println(optInt1.isPresent());
		System.out.println(optInt2.isPresent());
		System.out.println(optInt1.getAsInt());		// 0
//		System.out.println(optInt2.getAsInt());		// NoSuchElementException
		System.out.println("optInt1 = "+optInt1);
		System.out.println("optInt2 = "+optInt2);
		System.out.println("optInt1.equals(optInt2) ? "+optInt1.equals(optInt2));
		System.out.println();
		
		Optional<String> opt = Optional.ofNullable(null);	// 참조변수의 값이 null일가능성이있다면 ofNullable로 저장해야함 exception때문
		Optional<String> opt2 = Optional.empty();			// 빈 객체 생성
		System.out.println("opt = "+opt);					// Optional.empty
		System.out.println("opt2 = "+opt2);					// Optional.empty
		System.out.println("opt.eqauls(opt2) ? "+opt.equals(opt2));	// true
		System.out.println();
		
		int result3 = optStrToInt(Optional.of("123"), 0);
		int result4 = optStrToInt(Optional.of(""), 0);
		System.out.println("result3 = "+result3);
		System.out.println("result4 = "+result4);
		

 	}
	
	static int optStrToInt(Optional<String> optStr, int defaultValue) {
		try {
			return optStr.map(Integer::parseInt).get();
		} catch (Exception e) {
			return defaultValue;
		}
	}

}
