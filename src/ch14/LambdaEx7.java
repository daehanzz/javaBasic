package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);	// h2 = g.andThen(f)
		
		System.out.println(h.apply("FF"));	// "FF" -> 255 -> "1111 1111"
		System.out.println(h2.apply(2));	// 2 -> 10 -> 16
		
		Function<String, String> f2 = x -> x;	// 항등 함수(identity function)
		System.out.println(f2.apply("AAA"));	// AAA가 그대로 출력 됨
		
		Predicate<Integer> p = i -> i<100;
		Predicate<Integer> q = i -> i<200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();	// i>=100
		
		Predicate<Integer> all = notP.and(q.or(r));	// i >= 100 && (i<200 || i%2==0);
		System.out.println(all.test(150));		// true
		
		String str1 = "abc"; 
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		// equals로 비교하기때문에 new String("abc")로 바꿔주어도 true 
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
		
		
	}

}
