package ch14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2[] stuArr = {
				new Student2("이자바", 3, 300),
				new Student2("김자바", 1, 200),
				new Student2("안자바", 2, 100),
				new Student2("박자바", 2, 150),
				new Student2("소자바", 1, 200),
				new Student2("나자바", 3, 290),
				new Student2("감자바", 3, 180)	
			};
		
		Stream<Student2> stuStream = Stream.of(stuArr);
		
		stuStream.sorted(Comparator.comparing(Student2::getBan)
				.thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		
		stuStream = Stream.of(stuArr);	// forEach에 의해서 최종연산이 끝났기 때문에 스트림 다시 생성
		IntStream intStream = stuStream.mapToInt(Student2::getTotalScore);
		
		IntSummaryStatistics stat = intStream.summaryStatistics();
		System.out.println("count = "+stat.getCount());
		System.out.println("sum = "+stat.getSum());
		System.out.printf("avg = %.2f%n",stat.getAverage());
		System.out.println("min = "+stat.getMin());
		System.out.println("max = "+stat.getMax());
	}
}

class Student2 implements Comparable<Student2> {
	String name;
	int ban;
	int totalScore;
	
	Student2(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name,ban,totalScore).toString();
	}
	
	String getNane() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	
	@Override
	public int compareTo(Student2 s) {
		return s.totalScore - this.totalScore;
	}
}
