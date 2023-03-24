package ch14;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx8 {

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
		System.out.println("1. 단순그룹화(반별로 그룹화)");
		Map<Integer, List<Students>> stuByBan = Stream.of(stuArr).collect(Collectors.groupingBy(Students::getBan));
		
		for(List<Students> ban : stuByBan.values()) {
			for(Students s : ban) {
				System.out.println(s);
			}
		}
		System.out.println();
		
		System.out.println("2. 단순그룹화(성적별로 그룹화)");
		
		Map<Students.Level, List<Students>> stuByLevel = Stream.of(stuArr)
												.collect(Collectors.groupingBy(s-> {
														 if(s.getScore() >= 200) return Students.Level.HIGH;
													else if(s.getScore() >= 100) return Students.Level.MID;
													else                         return Students.Level.LOW;
												}));
		
		TreeSet<Students.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		for(Students.Level key : keySet) {
			System.out.println("["+key+"]");
			
			for(Students s : stuByLevel.get(key))
				System.out.println(s);
			System.out.println();
		}

		System.out.println("3. 단순 그룹화 + 통계(성적별 학생 수)");
		Map<Students.Level, Long> stuCntByLevel = Stream.of(stuArr)
													.collect(Collectors.groupingBy(s -> {
														if(s.getScore() >= 200) return Students.Level.HIGH;
														else if(s.getScore() >= 100) return Students.Level.MID;
														else return Students.Level.LOW;
													}, Collectors.counting()));
	
		for(Students.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s] - %d명, ", key,stuCntByLevel.get(key));
		System.out.println();
		
		for(List<Students> level : stuByLevel.values()) {
			System.out.println();
			for(Students s : level) {
				System.out.println(s);
			}
		}
		System.out.println();
		
		System.out.println("4. 다중그룹화(학년별, 반별)");
		Map<Integer, Map<Integer, List<Students>>> stuByHakAndBan = 
				Stream.of(stuArr).collect(Collectors.groupingBy(Students::getHak,Collectors.groupingBy(Students::getBan)));
		
		for(Map<Integer, List<Students>> hak : stuByHakAndBan.values()) {
			for(List<Students> ban : hak.values()) {
				for(Students s : ban) {
					System.out.println(s);
				}
			}
			System.out.println();
		}
		
		System.out.println("5. 다중그룹화 + 통계(학년별, 반별 1등)");
		Map<Integer, Map<Integer, Students>> topStuByHakAndBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Students::getHak,
						Collectors.groupingBy(Students::getBan,
							Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingInt(Students::getScore)),
								Optional::get
							)
						)
				));
		
		for(Map<Integer, Students> ban : topStuByHakAndBan.values())
			for(Students s : ban.values())
				System.out.println(s);

		System.out.println("6. 다중그룹화 + 통계(학년별, 반별 성적그룹)");
		Map<String, Set<Students.Level>> stuByScoreGroup = Stream.of(stuArr)
			.collect(Collectors.groupingBy(s-> s.getHak() + "-" + s.getBan(),
					Collectors.mapping(s-> {
						 if(s.getScore() >= 200) return Students.Level.HIGH;
					else if(s.getScore() >= 100) return Students.Level.MID;
						 else                    return Students.Level.LOW;
					} , Collectors.toSet())
			));

		 Set<String> keySet2 = stuByScoreGroup.keySet();

		for(String key : keySet2) {
			System.out.println("["+key+"]" + stuByScoreGroup.get(key));
		}

	}

}
