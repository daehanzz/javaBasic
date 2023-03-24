package ch14;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students[] stuArr = {
				new Students("나자바", true,  1, 1, 300),	
				new Students("김지미", false, 1, 1, 250),	
				new Students("김자바", true,  1, 1, 200),	
				new Students("이지미", false, 1, 2, 150),	
				new Students("남자바", true,  1, 2, 100),	
				new Students("안지미", false, 1, 2,  50),	
				new Students("황지미", false, 1, 3, 100),	
				new Students("강지미", false, 1, 3, 150),	
				new Students("이자바", true,  1, 3, 200),	
                           
				new Students("나자바", true,  2, 1, 300),	
				new Students("김지미", false, 2, 1, 250),	
				new Students("김자바", true,  2, 1, 200),	
				new Students("이지미", false, 2, 2, 150),	
				new Students("남자바", true,  2, 2, 100),	
				new Students("안지미", false, 2, 2,  50),	
				new Students("황지미", false, 2, 3, 100),	
				new Students("강지미", false, 2, 3, 150),	
				new Students("이자바", true,  2, 3, 200)	
			};
		
		System.out.println("1. 단순분할 (성별로 분할)");
		Map<Boolean, List<Students>> stuBySex = Stream.of(stuArr).collect(Collectors.partitioningBy(Students::isMale));
		
		List<Students> maleStu = stuBySex.get(true);
		List<Students> femaleStu = stuBySex.get(false);
		
		for(Students male : maleStu) System.out.println(male);
		for(Students female : femaleStu) System.out.println(female);
		System.out.println();
		
		System.out.println("2. 단순분할 + 통계 (성별 학생수)");
		Map<Boolean, Long> stuNumBysex = Stream.of(stuArr).collect(Collectors.partitioningBy(Students::isMale, Collectors.counting()));
		
		System.out.println("남학생 수 : "+stuNumBysex.get(true) + "명");
		System.out.println("여학생 수 : "+stuNumBysex.get(false) + "명");
		System.out.println();
		
		System.out.println("3. 단순분할 + 통계 (성별 1등)");
		Map<Boolean, Optional<Students>> topScoreBysex = Stream.of(stuArr)
														.collect(Collectors.partitioningBy(Students::isMale, Collectors
														.maxBy(Comparator.comparing(Students::getScore))));
		
		System.out.println("남학생 1등 : "+topScoreBysex.get(true).get());
		System.out.println("여학생 1등 : "+topScoreBysex.get(false).get());
		System.out.println();
		
		System.out.println("4. 다중분할(성별 불합격자, 100점이하)");
		Map<Boolean, Map<Boolean, List<Students>>> failedStuBySex = Stream.of(stuArr)
																	.collect(Collectors.partitioningBy(Students::isMale,
																	Collectors.partitioningBy(s -> s.getScore() <= 100)));
		
		List<Students> failedMaleStu = failedStuBySex.get(true).get(true);
		List<Students> failedFemaleStu = failedStuBySex.get(false).get(true);
		
		for(Students fmStu : failedMaleStu) System.out.println(fmStu);
		for(Students ffStu : failedFemaleStu) System.out.println(ffStu);
		
		
	}

}

class Students {
	String name;
	boolean isMale; // 성별
	int hak;		    // 학년
	int ban;		    // 반
	int score;

	Students(String name, boolean isMale, int hak, int ban, int score) { 
		this.name	= name;
		this.isMale	= isMale;
		this.hak	= hak;
		this.ban	= ban;
		this.score  = score;
	}
	String	getName()  { return name;}
	boolean isMale()    { return isMale;}
	int		getHak()   { return hak;}
	int		getBan()   { return ban;}
	int		getScore() { return score;}

	public String toString() { 
		return String.format("[%s, %s, %d학년 %d반, %3d점]",
			name, isMale ? "남":"여", hak, ban, score); 
	}
   // groupingBy()에서 사용
	enum Level { HIGH, MID, LOW }  // 성적을 상, 중, 하 세 단계로 분류
}
