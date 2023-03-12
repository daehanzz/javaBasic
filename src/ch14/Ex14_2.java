package ch14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_2 {
	public static void main(String[] args) {
		
		IntStream intStream = new Random().ints();	// 무한 스트림
		//IntStream intStream = new Random().ints(5);	// 크기가 5인 유한 스트림
		//IntStream intStream = new Random().ints(5,10);	// 5~9까지의 난수를 생성하는 유한 스트림
		intStream.limit(5).forEach(System.out::println); // 5개씩 자름 ,리밋이 없으면 무한히 출력됨
		
		/**
		 * 특정 범위으 정수를 요소로 갖는 스트림 생성 IntStream,LongStream
		 * IntStream intStream = IntStream.range(1,5) => 1,2,3,4
		 * IntStream intStream = IntStream.rangeClose(1,5) => 1,2,3,4,5
		 */
		
		// iterate(T seed, UnaryOperator f) 단항 연산자 입력 O, 출력 O
		Stream<Integer> intStream2 = Stream.iterate(0, n -> n+2); // 무한 스트림
		intStream2.limit(10).forEach(System.out::print);
		System.out.println();
		
		// generate(Supplier s) : 주기만 하는것 입력 X, 출력 O
		Stream<Integer> onStrema = Stream.generate(() -> 1); // 무한 스트림
		onStrema.limit(10).forEach(System.out::print);
		
		/**
		 * 파일을 소스로 하는 스트림 생성
		 * Stream<Path> Files.list(Path.dir)	// Path는 파일 또는 디렉토리
		 * 
		 * Stream<String> Files.lines(Path path)
		 * Stream<String> Files.lines(Path path, Charset cs)
		 * Stream<String> lines() // BufferedReader클래스의 메서드 라인단위를 읽어 스트링으로 반환
		 */
		
		/**
		 * 비어있는 스트림 생성
		 * Stream emptystream = Stream.empty(); // 빈스트림을 생성해서 반환 비어있기때문에 크기 0
		 */
	}
}
