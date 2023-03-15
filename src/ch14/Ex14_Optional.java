package ch14;

import java.util.Optional;

public class Ex14_Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = null;	// 에러. null pointer exception
		int[] arr = new int[0];
		System.out.println("arr.length = "+arr.length);
		
//		Optional<String> opt = null; // OK. 하지만 바람직하지 않다
		Optional<String> opt = Optional.empty();
		System.out.println("opt = "+opt);
//		System.out.println("opt = "+opt.get()); // excetpion 발생
		
		String str = "";
		
//		try {
//			str = opt.get();
//		} catch (Exception e) {
//			str = "";	// 예외가 발생하면 빈문자열("")로 초기화
//		}	// 예외발생

//		str = opt.orElse("EMPTY");	// Optional에 저장된 값이 null이면 EMPTY 반환
//		str = opt.orElseGet(() -> new String());	// Optional에 저장된 값이 null이면 "" 반환
		str = opt.orElseGet(String::new);	// Optional에 저장된 값이 null이면 "" 반환, 메서드참조 위와같음
		
		System.out.println("str = "+str);
	}

}
