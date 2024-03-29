package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import ch7.I;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random()*100)+1; // 1부터 100까지의 난수 생성
        Consumer<Integer> c = i -> System.out.print(i+", ");  // i 값 출력   
        Predicate<Integer> p = i -> i%2==0; // i가 2의 약소수인지 참거짓 판단
        Function<Integer,Integer> f = i -> i/10*10; // i의 1의 자리를 없앤다

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);
    }

    static <T> List<T> doSomething(Function<T,T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for(T i : list)
            newList.add(f.apply(i));
        
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for(T i : list) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i=0; i<10; i++) 
            list.add(s.get());
    }
}
