package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).parallel()		// 병렬로 처리 
//		.forEach(System.out::println);	
		.forEachOrdered(System.out::println);	// 병렬처리하더라도 순서유지	
		System.out.println();
		
		boolean noemptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);	// 스트림 요소가 전부 not이어야 true
		Optional<String> sWord = Stream.of(strArr)
									.filter(s -> s.charAt(0)=='s').findFirst();	// 조건에 맞는 첫번째 요소 반환
		
		System.out.println("noemptyStr = "+noemptyStr);
		System.out.println("sWord = "+sWord.get());
		System.out.println();
		// Stream<String>을 Stream<Integer>로 변환
//		Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);
		
		// Stream<String>을 IntStream 으로 변환. 성능때문에 이렇게 쓴다 !
		// 최종연산을 하면 스트림의 요소가 모두 소모되기때문에 여러번 선언해둠
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a + b);
		
		System.out.println("count = "+count);
		System.out.println("sum = "+sum);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
//		OptionalInt max = intStream3.max();
//		OptionalInt min = intStream4.min();
		
		System.out.println("max = "+max.getAsInt());
		System.out.println("min = "+min.getAsInt());
		
				
	}

}
