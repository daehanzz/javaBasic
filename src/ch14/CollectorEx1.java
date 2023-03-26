package ch14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = {"aaa","bbb","ccc"};
		Stream<String> strStream = Stream.of(strArr);
		
		String result = strStream.collect(new ConcatCollector());
		
		System.out.println(Arrays.toString(strArr));
		System.out.println("resule = "+result);
	}
}

class ConcatCollector implements Collector<String , StringBuilder, String> {
	
	@Override
	public Supplier<StringBuilder> supplier() {
//		return () -> new StringBuilder();
		return StringBuilder::new;
	}
	
	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		return (sb , s) -> sb.append(s);
//		return StringBuilder::append;
	}
	
	@Override
	public Function<StringBuilder, String> finisher() {
		return sb -> sb.toString();
//		return StringBuilder::toString;
	}
	
	@Override
	public BinaryOperator<StringBuilder> combiner() {
		return (sb, sb2) -> sb.append(sb2);
//		return StringBuilder::append;
	}
	
	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}
}
