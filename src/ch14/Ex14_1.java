package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * stream의 중간연산은 n번 실행 가능(여러번)
		 * stream의 최종연산한 1번만 실행 가능 실행 후 stream이 닫힌다
		 */

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();	// list를 Stream 으로 변환
		intStream.forEach(System.out::print);		// forEach()는 최종연산
		System.out.println();
		
		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다
		intStream = list.stream();					// list로 부터 stream을 새로 생성
		intStream.forEach(System.out::print);
		System.out.println();
		
		String[] strArr = new String[] {"A","B","C"};
		// Stream<String> strStream = Stream.of(strArr);	// 아래와 같음
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::print);
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		// IntStream을 이용하면 오토박싱 & 언박싱으로 인한 비효율을 줄일 수 있음
		// 속도향상 및 편리한 메서드 사용 가능
		IntStream intStream2 = Arrays.stream(intArr);	
		intStream2.forEach(System.out::print);
				
	}

}
