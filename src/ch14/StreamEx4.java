package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String[]> strArrStm = Stream.of(new String[] {"abc","def","gkl"},
												new String[] {"ABC","DEF","GKL"});
		
		Stream<String> strStrm = strArrStm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)	// 스트림의 요소를 모두 소문자로 변경
				.distinct()
				.sorted()
				.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))		// " +" => 정규식 하나이상의 공백
					.map(String::toLowerCase)
					.distinct()
					.sorted()
					.forEach(System.out::println);
		System.out.println();
	}

}
